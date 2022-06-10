<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>사이트 관리 페이지</title>
		<style>
		#wrap{
			width:500px;
			margin:0 auto;
			border:5px solid red;
			padding:20px;
			background-color:white;
		}
		ul{
			padding:0;
			margin:0;
		}
		ul li{
			list-style:none;
			border:2px solid purple;
			text-align:center; 
			width:65px;
			display:inline-block;
		}
		ul li hover{
			background-color:black;
			color:white;
		}
		
		input[type="submit"]{
			diplay:block;
			margin:10px auto;
			
		}
		</style>
	</head>
	<body>
		<div id="wrap">
			<form method="post" action="submit.jsp">
				<h1>안내문을 입력해주십시오.</h1>
				<ul>
					<li>미지정</li><li>미지정</li><li>미지정</li>	<li>미지정</li>
				</ul>
				<fieldset>
					<legend>배경색상 관리</legend>
					<input type="color" name="tint">
				</fieldset>	
				<fieldset>
					<legend>전경색상 관리</legend>
					<input type="color" name="hue">
				</fieldset>
				<fieldset>
					<legend>메뉴명 변경</legend>
					<input type="text" name="member" value="미지정">
					<input type="text" name="merchandise" value="미지정">
					<input type="text" name="advertisement" value="미지정">
					<input type="text" name="coding" value="미지정">
				</fieldset>
				<fieldset>
					<legend>안내문 관리</legend>
					<input type="text" name="notice" placeholder="안내문을 입력해주십시오.">
				</fieldset>
				<div id="change">
					<input type="submit" value="변경">
				</div>
			</form>
		</div>
	</body>
</html>