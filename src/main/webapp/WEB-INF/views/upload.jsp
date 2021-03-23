<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" enctype="multipart/form-data" action="/test">
		제목 <input type="text" name="tvTitle"><br> 
		이름 <input type="text" name="tvName"><br> 
		
		리포트 파일<input type="file" name="tvFile"><br>
		<button>리포트 전송</button>
	</form>
</body>
</html>