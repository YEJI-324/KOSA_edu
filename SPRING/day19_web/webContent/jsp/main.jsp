<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경로 지정에 대한 설정</title>
</head>
<body>
<h1>Hello JSP!</h1>

<h4>http://localhost:8080/day19_web/jsp/main.jsp</h4>

<h3>
Show Path!
</h3>
<%= request.getContextPath() %><br>
<%= request.getRequestURL() %><br>
<%= request.getServletPath() %><br>
<%= application.getContextPath() %><br>
<%= pageContext.getServletContext().getContextPath() %>

<p>result</p>
<pre>
	/day19_web
	http://localhost:8080/day19_web/jsp/main.jsp
	/jsp/main.jsp
	/day19_web
	/day19_web
</pre>

<hr>

<h4>print using EL</h4>

<pre>
${pageContext.request.contextPath }
${pageContext.request.requestURL }
${pageContext.request.requestURI }
${pageContext.servletContext.contextPath }
</pre>

<hr>

<h3>how to use java code in jsp</h3><p></p>
<%
	for(int i = 1;i<11;i++){
		out.print(i + "<br>");
	}
	
	// cannot declare method here
	/* public void show() {
		out.print("Hello");
	} */
	
	// can call method here
	String msg = show();
	out.print(msg+"<br>");
	out.print(show());
%>

<%!
	public String show() {
		return "HELLO";
	}

	// can't use iterators here
/* 	for(int i = 1;i<11;i++){
		out.print(i + "<br>");
	} */
%>

<%=show()%>
<hr>
<%="We are learning jsp grammer!" %>
<%= 3+5 %>
</body>
</html>