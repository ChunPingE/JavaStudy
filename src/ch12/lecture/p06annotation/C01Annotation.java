package ch12.lecture.p06annotation;

public class C01Annotation {
}

@MyAnnotation01
class MyClass {
	@MyAnnotation01
	String filed;

	@MyAnnotation01
	public MyClass() {
	}

	@MyAnnotation01
	void method1() {
		@MyAnnotation01
		int var;
	}

	void method2(@MyAnnotation01 int param) {

	}
}

@interface MyAnnotation01 {
}