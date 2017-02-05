<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>完成订单</title>
<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br>
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-5">
				<div class="span12 box">
					<div class="box-content">
						<h2>
							<span class="glyphicon glyphicon-ok-sign"></span>订单完成
						</h2>
						<h3>
							订单编号：
							<small><s:property value="#request.order.orderId" /></small>
						</h3>
						<h3>
							成交时间：
							<small><s:property value="#request.time" /></small>
						</h3>
						<h3>
							居住日期：<small>
							<s:property value="#request.order.orderInDate" />
							&nbsp;&nbsp;&nbsp;->&nbsp;&nbsp;&nbsp;
							<s:property value="#request.order.orderOutDate" />
							</small>
						</h3>
						<br> <a href="#" target=main
							onclick="javascript:history.go(-1);" class="btn btn-default">返回</a>
						<br><br>
					</div>

				</div>
			</div>
			<div class="col-md-1"></div>
			<div class="col-md-4">

				<div class="span12 box">
					<div class="box-content">
						<h2>在这给酒店留言</h2>
						<br> <br>
						<form class="bs-example bs-example-form" role="form" method="post"
							action="addMessage?userId=<s:property value="#session.user.userId"/>&orderId=<s:property value="#request.order.orderId"/>">
							<div class="input-group input-group-lg">
								<span class="input-group-addon">@</span> <input type="text"
									class="form-control" placeholder="欢迎吐槽" name="messageValue">
							</div>
							<br>
							<div class="input-group input-group-lg">
								<span class="input-group-addon">@</span> <input type="text"
									class="form-control" placeholder="给旅店打分" name="hotelMark">
							</div>
							<br>
							<button class="btn btn-primary" type="submit">提交</button>

						</form>
						<br>
					</div>
				</div>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</body>
</html>