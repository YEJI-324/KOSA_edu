package kr.or.kosa.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.kosa.domain.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {

	private SqlSessionTemplate myBatis;
	
	@Override
	public void insertBoard(BoardVO vo) {
		myBatis.insert("BoardDAO.insertBoard", vo); // 이름(식별자 명), 실제 가지고 있는 값.
		// Unique identifier matching the statement to execute.
	}

	@Override
	public void updateBoard(BoardVO vo) {
		myBatis.update("BoardDAO.updateBoard", vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		myBatis.delete("BoardAO.deleteBoard", vo);
	}

	@Override
	public List<BoardVO> selectAll(HashMap map) {
		return myBatis.selectList("BoardDAO.selectAll", map);
	}

	@Override
	public BoardVO selectBoard(BoardVO vo) {
		return myBatis.selectOne("BoardDAO.selectBoard", vo);
	}

}
