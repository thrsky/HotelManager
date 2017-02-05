<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<jsp:include page="css.jsp"></jsp:include>

</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/HotelManager/web/hotelIndex.jsp">ThrSky Room Booking</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/HotelManager/web/user/userRegister.jsp">注册</a></li>
				<li><a href="/HotelManager/web/user/userlogin.jsp">登录</a></li>
				<li class="active"><a href="/HotelManager/web/orderListByValues.jsp">订单</a></li>
				
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>
	<jsp:include page="js.jsp"></jsp:include>
</body>
</html>
