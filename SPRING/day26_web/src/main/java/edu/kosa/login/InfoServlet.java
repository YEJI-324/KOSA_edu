package edu.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 우선 여기에 선언해둔게 디비라고 생각
	public String uname="김예지";
	public String uage = "24";
	public String ulocal="전국";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String local = request.getParameter("local");
		
		response.setCharacterEncoding("euc-kr");
		System.out.println(name +", "+ age +", "+local);
		PrintWriter pw = response.getWriter();
//		pw.write("<h1>index page에서 servlet 불렀습니다.</h1>");
		
		pw.write("<html><head><title>myInfo</title></head><body><b><hr>");
		
		if(uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.println("password fail.");
			pw.write("<p><a href='./index.html'>다시 입력하기</a></p>");
		} else if(!uname.equals(name) && uage.equals(age) && ulocal.equals(local)) {
			pw.println("name fail.");
			pw.write("<p><a href='./index.html'>다시 입력하기</a></p>");
		} else if(uname.equals(name) && !uage.equals(age) && ulocal.equals(local))  {
			pw.write("<p>이름은 " + name + " 입니다</p>");
			pw.write("<p>나이는 " + age + " 살입니다</p>");
			pw.write("<p>사는 곳은 " + local + " 입니다</p>");
		} else {
			pw.write("<p>login fail</p>");
			pw.write("<p><a href='./index.html'>다시 입력하기</a></p>");
		}
		
		pw.write("</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); // post 방식으로 들어와도 get으로 탐.
	}

}
