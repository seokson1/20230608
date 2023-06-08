package com.yedam.memo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
//		List<Memo> list = new ArrayList<>();
//		list.add(new Memo(1, "20230503","내용1"));
		Scanner scn = new Scanner(System.in);
		MemoList app = new MemoListImpl(); // ArrayList.
											// 파일저장.
		boolean run = true; // DB. 저장
		int selectNo = 0;
		while (run) {
			System.out.println("1.추가 2.수정(번호&날짜) 3.삭제(번호 or 날짜기준) 4.조회(번호 or 날짜) 5.전체목록 6.종료");
			System.out.print("선택> ");
			try {
			selectNo = Integer.parseInt(scn.nextLine());
			}catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			if (selectNo == 1) {
				
				System.out.print("번호입력> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("날짜입력(ex:20201112)> ");
				String date = scn.nextLine();
				System.out.print("내용 입력> ");
				String content = scn.nextLine();
				
				if(date.equals("")) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					date = sdf.format(new Date()); //Date -> String 
				}
				
				app.input(new Memo(no, date, content));

			} else if (selectNo == 2) {
				System.out.print("번호입력> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("날짜입력(ex:20201112)> ");
				String date = scn.nextLine();
				System.out.print("변경할 내용 입력> ");
				String content = scn.nextLine();
				app.update(new Memo(no, date, content));

			} else if (selectNo == 3) {
				System.out.println("1.번호 | 2.날짜");
				int num = Integer.parseInt(scn.nextLine());
				int check = 0;
				String chk = "";
				if (num == 1) {
					System.out.print("삭제할 번호를 입력>");
					check = Integer.parseInt(scn.nextLine());
					app.delete(check);
				} else if (num == 2) {
					System.out.print("삭제할 날짜를 입력>");
					chk = scn.nextLine();
					app.delete(chk);
				}
			} else if (selectNo == 4) {
				System.out.println("1.번호 | 2.날짜");
				int num = Integer.parseInt(scn.nextLine());
				int check = 0;
				String chk = "";
				if (num == 1) {
					System.out.print("조회할 번호를 입력>");
					check = Integer.parseInt(scn.nextLine());
					app.search(num);
				} else if (num == 2) {
					System.out.print("조회할 날짜를 입력>");
					chk = scn.nextLine();
					app.search(chk);
				}
			} else if (selectNo == 5) {
				app.print();
			} else if (selectNo == 6) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	}

}
