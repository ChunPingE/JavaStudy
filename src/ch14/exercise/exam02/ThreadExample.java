package ch14.exercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MoviveThread();
		thread1.start();
		
		Thread thread2= new Thread(new MusicRunnable());
		thread2.start();
	}
}
