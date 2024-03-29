package ch15.sec04.exam02;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();

		Thread threadA = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				map.put(String.valueOf(i), i);
			}
		});

		Thread threadB = new Thread(() -> {
			for (int i = 1001; i <= 2000; i++) {
				map.put(String.valueOf(i), i);
			}
		});

		threadA.start();
		threadB.start();

		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int size = map.size();
		System.out.println("총 엔트리 수:" + size);
		System.out.println();
	}
}
