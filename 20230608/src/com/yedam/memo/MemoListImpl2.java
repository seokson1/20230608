package com.yedam.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl2 implements MemoList {

	List<Memo> list = new ArrayList<Memo>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void input(Memo memo) {
		// 동일여부를 체크.
		for (int i = 0; i < list.size(); i++) {
			// if (list.get(i).equals(memo)) { // Object.equals();
//			Memo memo1 = list.get(i);
			if (list.get(i).equals(memo)) {
				System.out.println("same");
				return;
			}
		}

		// 순번지정.
		for (int i = 0; i < list.size(); i++) {
			// 20230501 < 20230505
			if (Integer.parseInt(list.get(i).getDate()) > Integer.parseInt(memo.getDate())) {
				list.add(i, memo);
				return;
//			} else if (Integer.parseInt(memo.get(i).getDate()) == Integer.parseInt(memo.getDate())) {
				// 날짜가 동일한 경우에는 순번 비교.
			}
		}
		list.add(memo);
		// 날짜순으로 저장. + 번호.
		System.out.println("추가완료.");

	}

	@Override
	public void update(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == memo.getNo() //
					&& list.get(i).getDate().equals(memo.getDate())) {
				list.get(i).setContent(memo.getContent());
				System.out.println("수정완료.");
				return;
			}
		}

	}

	@Override
	public void delete(int no) {
		// 같은 번호가 있으면 다 삭제.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				list.remove(i--); // |0|1|2|3|
			}
		}

	}

	@Override
	public void delete(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				list.remove(i--);
			}
		}
	}

	@Override
	public void search(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				System.out.println(list.get(i).toString());
			}
		}
	}

	@Override
	public void search(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				System.out.println(list.get(i).toString());
			}
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
