package kr.or.kosa.dao;

import java.util.HashMap;
import java.util.List;

import kr.or.kosa.domain.BoardVO;

public interface BoardDAO {
	
	public void insertBoard(BoardVO vo);
	
	public void updateBoard(BoardVO vo);
	
	public void deleteBoard(BoardVO vo);
	
	public List<BoardVO> selectAll(HashMap map);
	
	public BoardVO selectBoard(BoardVO vo);
}
