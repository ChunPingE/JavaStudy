package ch11.lecture.p04throw;

public class C11Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws ClassNotFoundException {
		Class.forName("");
	}
}
