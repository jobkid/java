<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "Beans.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "DAO.NoticeDAO" %>
<jsp:useBean id="noticeDao" class = "DAO.NoticeDAO" scope="page" />    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>공지사항 내용</title>
	</head>
	<body>
		<%
			/*
			NoticeBean notice = noticeDao.getPost(num);
			String nick = notice.getNickname();
			String title = notice.getTitle();
			String time = notice.getWritingtime();
			String content = notice.getContent();
			String writing = notice.getWritingtime();*/
			
			//int num = Integer.parseInt(request.getParameter("number"));
			NoticeDAO notice = noticeDao.getInstance();
			//ArrayList<NoticeBean> list = notice.getNotice();
			NoticeBean nb = new NoticeBean();
			//list.add(nb);
			
			NoticeBean bean=notice.getPost(notice.getNum());
			bean.getNickname();
			bean.getTitle();
			bean.getWritingtime();
			bean.getContent();
			bean.getWritingtime();
			
		%>
		<h1>공지사항</h1>
		<table border = "1">
			<tr>
				<th>작성자 : </th><th>제목 : </th><th>작성시간 : </th>
			</tr>
			<tr>
				<td><%=bean.getNickname()%></td><td><%=bean.getTitle() %></td><td><%=bean.getWritingtime() %></td>
			</tr>
			<tr>
					<td rowspan="3"><%=bean.getContent() %></td>
			</tr>
		</table>
	</body>
</html>