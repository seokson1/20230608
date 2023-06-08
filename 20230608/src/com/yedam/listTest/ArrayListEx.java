package com.yedam.listTest;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 저장유형이 object.
		list.add("Apple");
		// list.add(new Integer(10));
		for (int i = 0; i < list.size(); i++) {
			// 결과고 Object로 받음.
//			Object result = list.get(i);
//			if(result instanceof String) {
//				System.out.println((String)result);
//			} else if(result instanceof Integer) {
//				System.out.println((Integer) result);
//			}
			String result = list.get(i);
			System.out.println(result);
		}

		ArrayList<Integer> nList = new ArrayList<Integer>();
		// 추가
		nList.add(10);
		nList.add(20);
		// 삭제
		nList.remove(1); // 특정 위치값 삭제 index 위치 넣기
		// 수정
		nList.set(0, 100); // 특정 위치값 index 입력 다음 변경값 넣기
		nList.add(200);

		for (Integer num : nList) {
			System.out.println(num);
		}
	}

}
