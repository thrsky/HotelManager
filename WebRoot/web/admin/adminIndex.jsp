<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>adminIndex</title>
<jsp:include page="/web/css.jsp"></jsp:include>
</head>
<body style="margin-top: 50px">
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

						<li class='dropdown dark user-menu'><a
							class='dropdown-toggle' data-toggle='dropdown' href='#'> <img
								alt='Mila Kunis' height='23' src='../assets/images/avatar.jpg'
								width='23' /> <span class='user-name hidden-phone'> <s:property
										value="#session.admin.adminUserName" />
							</span> <b class='caret'></b>
						</a>
							<ul class='dropdown-menu'>
								<li><a href='adminInfo.jsp'> <i class='icon-user'></i>
										Profile
								</a></li>
								<li><a href='#changePwd' data-toggle="modal"> <i
										class='icon-cog'></i> ChangePassword
								</a></li>
								<li class='divider'></li>
								<li><a href='adminlogin.jsp' data-transition="pop"> <i
										class='icon-signout'></i> Sign out
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

	<div class="modal fade" id="changePwd" tabindex="-1" role="dialog"
		aria-labelledby="changePwdLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="changePwdLabel">修改密码</h4>
				</div>
				<form id="adminchangepwd" method="post" action="adminChangePwd">
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
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2">
				<nav class="navbar navbar-vertical-left" style="margin-top: 50px">
				<ul class="nav navbar-nav">
					</a></li>
					<li><a href="findAllHotel"> <i
							class="fa fa-fw fa-lg fa-download "></i> <span>旅店 </span>
					</a></li>
					<li><a href="findAllUser"> <i
							class="fa fa-fw fa-lg fa-desktop"></i> <span>用户 </span>
					</a></li>
				</ul>
				</nav>

			</div>
		</div>
	</div>


	<jsp:include page="/web/js.jsp"></jsp:include>

</body>
</html>