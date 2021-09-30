package com.kosa.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aa")
public class ServletDate extends HttpServlet{ // 전송방식

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servlet");
		
		response.setCharacterEncoding("euc-kr");
		
		Calendar c = Calendar.getInstance();
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>서버측 시간</title></head>");
		out.write("<body><h1>Hello Servlet</h1>");
		out.write("<h2>현재시간은 ");
		out.write(hour+"시 ");
		out.write(minute +"분 ");
		out.write(second +"초 입니다.");
		out.write("<img src='images/bird.jpg' />");
		out.write("</h2></body></html>");
		out.close();
	}	
}
