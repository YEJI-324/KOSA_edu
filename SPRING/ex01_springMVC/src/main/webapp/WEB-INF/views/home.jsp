<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<c:set var="path" value="${pageContext.request.contextPath}/resources" scope="application"/>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
뭐람
<img alt="yeri" src="resources/profile_yeri.jpg" width="300px">

<h3>set src path using EL</h3>
<img alt="yeri" src="${path}/profile_yeri.jpg" width="200px">
</body>
</html>
