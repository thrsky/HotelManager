<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Demo Show Web</title>
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="page-header text-center">
			<h1>下面是我的部分项目演示</h1>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="page-header text-center">
					<h3>酒店预订系统</h3>
				</div>
				<div id="carousel-example-generic" class="carousel slide"
					data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0"
							class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="images/hotel.PNG" class="img-responsive" alt="酒店主页">
							<div class="carousel-caption">...</div>
						</div>
						<div class="item">
							<img src="images/login.PNG" class="img-responsive" alt="用户登录">
							<div class="carousel-caption">...</div>
						</div>
						<div class="item">
							<img src="images/doneOrder.PNG" class="img-responsive" alt="确认订单">
							<div class="carousel-caption">...</div>
						</div>
					</div>

					<!-- Controls -->
					<a class="left carousel-control" href="#carousel-example-generic"
						role="button" data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#carousel-example-generic"
						role="button" data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
				<hr>
				<a class="btn btn-default btn-lg " href="HotelManager/web/hotelIndex.jsp">去看看</a>
			</div>
			<div class="col-md-4">
				<div class="page-header text-center">
					<h3>秒杀网站API</h3>
				</div>
			</div>
			<div class="col-md-4">
				<div class="page-header text-center">
					<h3>在线购物网站</h3>
				</div>
			</div>
		</div>
	</div>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>