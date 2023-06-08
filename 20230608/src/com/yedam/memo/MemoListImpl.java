package com.yedam.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl implements MemoList {

	List<Memo> list = new ArrayList<Memo>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void input(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			// if (list.get(i).equals(memo)) { //object.equals();
			Memo memo1 = list.get(i);
			if (memo1.getNo() == memo.getNo() && memo1.getDate().equals(memo.getDate())
					&& memo1.getContent().equals(memo.getContent())) {
				System.out.println("same");
				return;
			}
			
		}
		//날짜 순으로 저장 구현
		for(int i=0; i<list.size(); i++) {
			if(Integer.parseInt(list.get(i).getDate())  > Integer.parseInt(memo.getDate()) ) {
				list.add(i, memo);
			} else {
				list.set(i, list.get(i));
			}
		}
		list.add(memo);
		// 날짜순으로 저장.
		System.out.println("추가완료.");
	}

	
	
	@Override
	public void update(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			if (memo.getNo() == list.get(i).getNo() && memo.getDate().equals(memo.getDate())) {
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
				list.remove(i--);
				// |0|1|2|3|4 => 2번 삭제시 |0|1|3|4 되지 않고 한칸씩 줄기 때문에
				// 인덱스값이 줄기 때문에.
			}
		}
		System.out.println("삭제완료.");
	}

	@Override
	public void delete(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				list.remove(i--);
			}
		}
		System.out.println("삭제완료.");
	}

	@Override
	public void search(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				System.out.printf("번호 %d 날짜 %s 내용 %s \n", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());
			}
		}
	}

	@Override
	public void search(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				System.out.printf("번호 %d 날짜 %s 내용 %s \n", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());
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
