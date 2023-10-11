package kr.co.yangdoll.repository;

import java.util.List;

import kr.co.yangdoll.domain.BoardBean;

public interface BoardDAO {

	List<BoardBean> boardList(int start, int end);

	int boardCount();

	int maxNum();

	int boardAdd(BoardBean board);

	BoardBean boardDetail(int num);

	int seqUpdate(int board_RE_REF, int board_RE_SEQ);

	int boardModify(BoardBean board);

	int boardDelete(int num);

}
