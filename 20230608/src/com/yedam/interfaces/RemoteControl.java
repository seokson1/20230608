package com.yedam.interfaces;

// 개발표준.
public interface RemoteControl {
	int MAX_VOLUME = 10;
	
	void tuenOn(); // public abstract => 따로 선언하지 않아도 default로 이미 되어 있음.
	void turnOff();
	void setVolume(int volume);
	
}
