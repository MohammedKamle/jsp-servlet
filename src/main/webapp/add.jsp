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
	-All the logic which is written inside <%%> is copy-pasted inside service() method which is inside the Servlet
        class developed at runtime by jsp" 
	- If we want to declare a variable outside service() methods, we need to write it
	inside <%!%> as shown below
	 --> 
	 <%!
	 int thisVariableIsOutsideServiceMethod = 0;
	 %>
	 
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i + j;

	out.println("Results of addition is :" + k+". Also our variable which is outside the service method, its value is :"+thisVariableIsOutsideServiceMethod);
	%>



</body>
</html>
