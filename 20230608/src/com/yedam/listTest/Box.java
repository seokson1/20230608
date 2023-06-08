package com.yedam.listTest;

public class Box<T> {
	private Object obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getobj() {
		return (T) obj;
	}
}
