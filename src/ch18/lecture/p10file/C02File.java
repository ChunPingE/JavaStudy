package ch18.lecture.p10file;

import java.io.*;

public class C02File {
	public static void main(String[] args) {
		// File (file 또는 directory)에 관한 객체
		File file = new File("output");
		
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println("디렉토리내 파일 목록");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
