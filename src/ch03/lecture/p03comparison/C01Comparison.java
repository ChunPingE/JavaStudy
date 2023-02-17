package ch03.lecture.p03comparison;

public class C01Comparison {
	public static void main(String[] args) {
		
		// 비교연산자
		// ==, !=, < ,<=, >, >=
		
		// 연산결과는 boolean
		int x = 3;
		int y = 5;
		
		boolean r1 = x == y; // false
		boolean r2 = x != y; // true
		
		boolean r3 = x < y; // true
		boolean r4 = x <= y; // true
		
		boolean r5 = x > y; // false
		boolean r6 = x >= y; // false
		
		// 주의할점
		// 변수를 선언할때 타입이 정해져서 타입이 같은지를 비교하는 연산자가 없다.
		// === !== 같은것들
		
		// 같은 타입끼리 비교해야함
		int a = 30;
		String b = "50";
		boolean c = true;
		
		// boolean r7 = a < b; 다른타입 비교 불가
		// boolean r8 = a< c;
		
		// 정수, 실수는 가능
		// 하지만 타입을 맞춘 후 비교 권장
		
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2;
		System.out.println(r9); // true
	}










}
