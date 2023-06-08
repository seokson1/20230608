package com.yedam.interfaces;

public class Television implements RemoteControl {
	
	int volume;
	
	@Override
	public void tuenOn() {
		System.out.println("TV 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV 볼륨 : " + this.volume);
	}

}
