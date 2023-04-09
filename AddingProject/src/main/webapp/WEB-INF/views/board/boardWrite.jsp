<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글작성 페이지</h1>
<hr>

<form href="./board" method="post">
	<label>제목</label>
	<input type="text" name="title">

	<label>내용</label>
	<textarea name="context"></textarea>
</form>
</body>
</html>