package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {

		try {
			int result = divide(3, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0은 입력하지 마세요.");
		}
		try {
			method("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ee) {
			System.out.println("알수없는 예외.");
		}
	}

	public static void method(String cls) throws ClassNotFoundException, Exception { // throws 메서드 실행한 메인 클래스에서 가져감. 호출한
																						// 영역에 예외를 넘기는 것.

		Class.forName(cls);

		System.out.println("end of method");
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
