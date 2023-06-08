package com.yedam.memo;

//기능을 정의.
public interface MemoList {
	// 등록.
	void input(Memo memo);

	// 수정.
	void update(Memo memo); // 번호, 날짜 -> 내용변경

	// 삭제.
	void delete(int no); // 번호기준 삭제.

	void delete(String date); // 날짜기준 삭제.

	// 조회.
	void search(int no); // 번호기준 조회.
	void search(String date); // 날짜 기준 조회.
	//전체목록 조회.
	void print();
	
}
