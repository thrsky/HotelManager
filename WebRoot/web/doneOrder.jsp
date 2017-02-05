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
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<div class="span12 box">
					<div class="box-content">
						<h2>
							<span class="glyphicon glyphicon-ok-sign"></span>订单已申请 <small>你可以通过右上角"订单"来查看具体信息</small>
						</h2>
						<h3>
							申请时间：
							<small><s:property value="#request.orderDate" /></small>
						</h3>
						<h3>
							入住日期：<small>
							<s:property value="#request.InDate" />
							</small>
						</h3>
						<h3>
							离店日期：<small>	
							<s:property value="#request.OutDate" />
							</small>
						</h3>
						<br> <a href="#" target=main
							onclick="javascript:history.go(-1);" class="btn btn-default">返回</a>
						<br><br>
					</div>

				</div>
			</div><div class="col-md-4">
		</div>
	</div>
</body>
</html>