<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<jsp:include page="/web/css.jsp"></jsp:include>
</head>
<body>
	<header>
	<div class="container-fluid">
		<div class="row">
			<!-- 顶部导航栏属性 -->
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"><span>Room Booking
							System</span></a> <a class="navbar-brand"
						href="/HotelManager/web/hotelIndex.jsp">想你所享</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="/HotelManager/web/hotelIndex.jsp">主頁</a></li>

					</ul>
					<!-- Single button -->

					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search"
								name="value">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>

					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a
							href="findOrdersByUserId?userId=<s:property value="#session.user.userId"/>">订单</a></li>
						<li class='dropdown dark user-menu'><a
							class='dropdown-toggle' data-toggle='dropdown' href='#'> <img
								alt='Mila Kunis' height='23'
								src='/HotelManager/web/assets/images/avatar.jpg' width='23' />
								<span class='user-name hidden-phone'> <s:property
										value="#session.user.userName" />

							</span> <b class='caret'></b>
						</a>
							<ul class='dropdown-menu'>
								<li><a href='/HotelManager/web/user/userInfo.jsp'> <i
										class='icon-user'></i> 修改个人信息
								</a></li>
								
								<li><a href='#changeUserPwd' data-toggle="modal"> <i
										class='icon-cog'></i> ChangePassword
								</a></li>
								<li class='divider'></li>
								<li><a href='/HotelManager/web/user/userlogin.jsp'
									data-transition="pop"> <i class='icon-signout'></i> Sign
										out
								</a></li>
							</ul></li>

					</ul>
					<ul class="nav navbar-nav navbar-right">
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid --> </nav>
			
		</div>
	</div>

	<div class="modal fade" id="changeUserPwd" tabindex="-1" role="dialog"
		aria-labelledby="changePwdLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="changePwdLabel">修改密码</h4>
				</div>
				<form id="userchangepwd" method="post" action="userChangePwd">
					<div class="modal-body">

						<div class="alert alert-danger" role="alert">修改密码时请注意密码的安全</div>
						<hr>
						<h4>
							输入您现在使用的密码 <span class="label label-default">Old Pwd</span>
						</h4>
						<h5></h5>
						<div class="input-group">
							<span class="input-group-addon">P</span> <input type="text"
								class="form-control" name="oldpassword" id="oldpassword"
								placeholder="old password">
						</div>
						<h4></h4>
						<hr>
						<h4></h4>
						<h4>
							输入您想要使用的密码 <span class="label label-default">New Pwd</span>
						</h4>
						<h5></h5>
						<div class="input-group">
							<span class="input-group-addon">P</span> <input type="text"
								class="form-control" name="newpassword" id="oldpassword"
								placeholder="new password">
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">提交更改</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script>
		$(function() {
			$('#changePwd').modal({
				keyboard : true
			})
		});
	</script> </header>


	<jsp:include page="../js.jsp"></jsp:include>
</body>
</html>