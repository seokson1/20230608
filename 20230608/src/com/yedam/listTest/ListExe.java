package com.yedam.listTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		// 인터페이스.(List) - 구현 클래스 (ArrayList, LinkedList)
		List<String> list = null;
		list = new ArrayList<String>();
		list = new LinkedList<String>();

		list.add("Apple"); // index 값 : 0번 list.get(0); 글 번호 시 1번
		list.add("Banana"); // index 값 : 0번 list.get(1); 글 번호 시 2번

		// Date 자바.
		Date today = new Date(); // Thu Jun 08 11:44:37 KST 2023
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 2023-06-08 11:44:52 양식 수정 되어 출력.
		System.out.println(sdf.format(today)); // 출력시 format(); Date 객체 -> 문자열 변환 후 출력
		String foramt = sdf.format(today);
		System.out.println(foramt);
		
		String sdate = "2023-07-22 13:13:13";
		try {
			Date date = sdf.parse(sdate); // 문자열 -> Date 객체로 변환 : Sat Jul 22 13:13:13 KST 2023 출력 방식 변경
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
