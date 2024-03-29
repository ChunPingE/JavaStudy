package ch14.lecture.p05concurrency;

public class C01Concurrency {
	static int field = 0;

	public static void main(String[] args) {

		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}
		}, "A Thread");

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}
		}, "B Thread");

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 여러 스레드가
		// 하나의 객체 상태를 변경하려고 할때
		// 매번 주의해서 코드를 작성해야한다.

		// 해결책1: 여러 스레드가 하나의 객체상태를 변경하는 코드를 작성하지 않느다.
		System.out.println(field);
	}
}
