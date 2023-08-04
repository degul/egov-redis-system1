
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
드라마 선택 결과<br>
<%
request.setCharacterEncoding("utf-8");
String drama = request.getParameter("drama");			//request
String myId = (String)session.getAttribute("idKey");	//session은 어디서든 부를 수 있음 (단, casting 필!) - 각각의 클라이언트가 접근할 수 있는 모든 파일 public

if(myId != null){
%>
<%=myId %>란 id를 가진 분이 선택한 드라마는<%=drama %> 입니다.<br>
세션 아이디: <%= session.getId() %><br>
세션 유효시간: <%= session.getMaxInactiveInterval() %>
<%
}else{
	out.println("세션이 설정되지 않음");
}
%>
</body>
</html>