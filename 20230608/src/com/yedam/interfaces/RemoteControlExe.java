package com.yedam.interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		// interface 다중 상속 허용
		//Audio audio = new Audio();
		//Television audio = new Television();
		RemoteControl remote = new Audio();
		remote = new Television();
		// 코드 최소화를 위해서
		remote.tuenOn();
		remote.setVolume(6);
		remote.turnOff();
		
		
	}
}
