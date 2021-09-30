package edu.kosa.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public abstract class GiftDAO { // 추상클래스
	
	// DB 연결 관관련 메소드
	public abstract Connection getConnection() throws Exception;
	
	// insert
	
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
	
	// update
	
	// delete
}

/*
 * 1. 드라이버 로드
 * 2. connect & open
 * 3. 사용(DML)
 * 4. 닫기(close)
 * */
