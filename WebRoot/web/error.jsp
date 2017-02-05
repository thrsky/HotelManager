<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>异常</title>
<jsp:include page="/web/css.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
			<br>
				<br>
				<br>
				<br>
				<br>
				<div class="alert alert-warning">
				
					<a href="#" class="close" data-dismiss="alert"> &times; <h3></a> <strong>警告！</strong>您的请求引发了异常。<a onclick="location.href='javascript:history.go(-1);'">返回原界面</a></h3>
				</div>
			</div>
			<div class="col-md-8"></div>
		</div>
	</div>


	<jsp:include page="/web/js.jsp"></jsp:include>
</body>
</html>