<%@page import="dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%-- forward �������� ���޵����� �ޱ� --%>
    
    <% List<User> userList = (List<User>)request.getAttribute("userAllList"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>adminPage</h1>
<hr>
<table border="1">
	<thead>
		<tr>
			<th>USER_NO</th>
			<th>USER_ID</th>
			<th>USER_PW</th>
		</tr>
	</thead>
	<tbody>
	<% for(int i=0; i<userList.size(); i++) { %>
	
		<tr>
			<td><%=userList.get(i).getUserNo() %></td>
			<td><%=userList.get(i).getUserId() %></td>
			<td><%=userList.get(i).getUserPw() %></td>
		</tr>
	<% } %>
	</tbody>
</table>
</body>
</html>