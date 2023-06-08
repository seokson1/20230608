package com.yedam.listTest;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObj("사과");
		String result = box.getobj();
		System.out.println(result);

		Box<Integer> nbox = new Box<Integer>();
		nbox.setObj(10);
		Integer nResult = nbox.getobj();
		System.out.println(nResult);
	}
}
