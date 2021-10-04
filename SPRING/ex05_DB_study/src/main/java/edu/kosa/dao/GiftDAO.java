package edu.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.kosa.model.GiftVO;

public abstract class GiftDAO { // 추상클래스
	
	// DB 연결 관관련 메소드
	public abstract Connection getConnection() throws Exception;
	
	// insert
	public void insert(GiftVO gift) throws Exception{
		Connection conn = getConnection();
		// insert into gift(gno, gname, g_start, g_end) values(13, '공책', 100, 2000);
		
		// sql 직접 입력하기
//		String sql = "insert into gift(gno, gname, g_start, g_end) values(13, '공책', 100, 2000)";
//		Statement stmt = conn.createStatement();
//		int result = stmt.executeUpdate(sql);
		
		// sql 포맷으로 입력하기
		String sql = "insert into gift(gno, gname, g_start, g_end) values(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, gift.getGno());
		pstmt.setString(2, gift.getGname());
		pstmt.setInt(3, gift.getG_start());
		pstmt.setInt(4, gift.getG_end());
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + " 개 입력 성공");
//		stmt.close();
		pstmt.close();
		conn.close();
	}
	
	// selectAll
	public void selectAll() throws Exception{
		// 2. open
		Connection conn = getConnection(); // GiftDAOImpl에서 구현된 getConnection() 호출됨 -> conn 리턴받음.
		// 3. 사용(DML) - Statement, PreparedStatement
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // select는 가져온 결과를 담을 객체가 필요함. ResultSet
		
		System.out.println("GNO \t GName \t 최하가 \t 최고가");
		
		while(rs.next()) {
			int gno = rs.getInt("gno"); // rs.getXXX(index); or rs.getXXX("id");
			String gname = rs.getString(2);
			int gstart = rs.getInt("g_start");
			int gend = rs.getInt("g_end");
			
			System.out.println(gno + " \t "+ gname + " \t "+ gstart + " \t " + gend);
		}
	}
	
	// select - 조건에 맞는 것 select 하기 (gno)
	public GiftVO select(int gno) throws Exception {
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM GIFT WHERE GNO = ?");
		ps.setInt(1, gno);
		ResultSet rs = ps.executeQuery();
		rs.next();
		GiftVO vo = new GiftVO();
		
		vo.setG_end(rs.getInt("g_end"));
		vo.setG_start(rs.getInt("g_start"));
		vo.setGname(rs.getString("gname"));
		vo.setGno(gno);
		
		return vo;
	}
	
	// update
	
	// delete
}

/*
 * 1. 드라이버 로드
 * 2. connect & open
 * 3. 사용(DML)
 * 4. 닫기(close)
 * */
