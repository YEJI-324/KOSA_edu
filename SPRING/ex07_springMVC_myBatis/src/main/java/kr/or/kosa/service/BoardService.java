package kr.or.kosa.service;

import java.util.HashMap;
import java.util.List;

import kr.or.kosa.domain.BoardVO;

public interface BoardService {
	
	// CRUD
	void insertBoard(BoardVO vo);
	
	void updateBoard(BoardVO vo);
	
	void deleteBoard(BoardVO vo);
	
	List<BoardVO> selectAll(HashMap map);
	
	BoardVO selectBoard(BoardVO vo);
}
