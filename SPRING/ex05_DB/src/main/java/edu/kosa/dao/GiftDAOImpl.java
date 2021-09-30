package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftDAOImpl extends GiftDAO {

	@Override
	public Connection getConnection() throws Exception {
		// 1. 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. connect & open
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@kosa3.iptime.org:50103:orcl", // 연결할 오라클 서버
				// 드라이버(물리적위치):@ip주소:포트번호:SID
				"yeji", // 이름
				"oracle"); // 비밀번호
		return null;
	}

	
	/*
	 * 1. 드라이버 로드
	 * 2. connect & open
	 * 3. 사용(DML)
	 * 4. 닫기(close)
	 * */
}
