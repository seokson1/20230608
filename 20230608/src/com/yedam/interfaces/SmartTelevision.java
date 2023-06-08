package com.yedam.interfaces;

// 인터페이스 다중 상속을 허용함.
public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void tuenOn() {
		System.out.println("SmartTV 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
	}

}
