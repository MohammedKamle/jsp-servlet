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
	-With JSP we can write java code inside html as shown below
	If you see below we have not initialised HttpServletRequest and PrintWriter objects, 
	it is done implicitly by jsp
	-At runtime the jsp is converted into Servlet which inturn is used by Tomcat
	-All the logic which is written inside <%%> is copy-pasted inside service() method
	 of the Servlet developed by jsp at runtime" 
	 --> 
	 
	 <!-- - If we want to declare a variable outside service() methods, we need to write it
	inside <%!%> as shown below (its called declaration)-->
	<!-- declaration tag -->
	 <%!
	 int thisVariableIsOutsideServiceMethod = 0;
	 %>
	 
	 <!-- If we want to import a package we write in the following way(its called directive) -->
	 <!-- directive tag  -->
	 <%@ page import="java.util.Date, java.io.FileOutputStream" %>
	 
	 
	 
	 <!-- scriplet tag -->
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i + j;

	out.println("Results of addition is :" + k+". Also our variable which is outside the service method, its value is :"+thisVariableIsOutsideServiceMethod);
	
	%>
	<!-- below is used to implicity call out.println  -->
	<!-- expression tag -->
	<%= "<br></br>Hi, I have been written inside exprssion, by accessing variable which is outside the service method I get  :"+thisVariableIsOutsideServiceMethod %>



</body>
</html>