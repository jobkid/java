<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "beans.StoryBean" %>
<%@ page import = "DAO.StoryDAO" %>
<%@ page import = "java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>단편소설 리스트</title>
		<style>
			*{
				margin : 0 auto;
				padding : 0;
				text-align : center
			}
		</style>
	</head>
	<body>
		<div id = "wrap">
			단편소설 리스트 
			<table border="1">
				<tr>
					<th>번호</th><th>제목</th><th>작성자</th><th>날짜</th>
				</tr>
				<c:forEach items="${data}" var = "data">
				<tr>
					<td>${data.getNum }</td>
					<td>${data.getTitle }</td>
					<td>${data.getNickname }</td>
					<td>${data.getWritingdate }</td>	
				</tr>
				</c:forEach>
			</table>
		<form action = "ShowShort.do" method = "get">
			<input type="hidden" name="currentPage" value="1">
			<select name = "recordsPerPage">
				<option value = "5">5개씩 보기</option>
				<option value = "10" selected>10개씩 보기</option>
				<option value = "15">15개 보기</option>
			</select>
			<input type = "submit" value = "보기">
		</form>	
		<ul>
			<c:forEach begin = "1" end = "${nOfPage}" var = "i">
				<c:choose>
					<c:when test = "${currentPage eq i}">
						<li><a>${i}(현재)</a></li>
					</c:when>
				<c:otherwise>
					<li><a href="ShowShort.do?currentPage=${i}&recordsPerPage=${recordsPerPage}">${i}</a></li>
				</c:otherwise>
				</c:choose>
			</c:forEach>
		</ul>
		<form method = "post" action = "write.jsp">
			<input type = "submit" value = "글쓰기">
		</form>
	</body>
</html>