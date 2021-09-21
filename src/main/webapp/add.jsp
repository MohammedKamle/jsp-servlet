<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<!-- 
	With JSP we can write java code inside html as shown below
	If you see below we have not initialised HttpServletRequest and PrintWriter objects, 
	it is done implicitly by jsp
	
	 -->
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));

	int k = i + j;

	out.println("Results of addition is :" + k);
	%>



</body>
</html>