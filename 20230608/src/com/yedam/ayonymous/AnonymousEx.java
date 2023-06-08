package com.yedam.ayonymous;

//익명 구현객체. 인터페이스 구현객체로 클래스로 선언하지 않고 이름없는 클래스.
public class AnonymousEx {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run(); // run 매소드 다른 기능.

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("고양이가 달립니다.");
			}
		};
		runnable.run();
		// 매개값으로 함수 사용. 람다표현식.
		runnable = () -> System.out.println("기차가 달립니다.");

		runnable.run();
	}
}
