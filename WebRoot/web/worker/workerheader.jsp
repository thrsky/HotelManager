<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>workerIndex</title>
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
							System</span></a> <a class="navbar-brand" href="/HotelManager/web/hotelIndex.jsp">想你所享</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href=#>主頁</a></li>
						<li><a href="findRoomByWorker?workerId=<s:property value="#session.worker.workerId"/>">房间管理</a></li>
						<li><a href="findOrderByWorker?workerId=<s:property value="#session.worker.workerId"/>">订单管理</a></li>
						<li><a href="findMessageByWorker?workerId=<s:property value="#session.worker.workerId"/>">留言管理</a></li>
					</ul>
					<!-- Single button -->

					<ul class="nav navbar-nav navbar-right">

						<li class='dropdown dark user-menu'><a
							class='dropdown-toggle' data-toggle='dropdown' href='#'> <img
								alt='Mila Kunis' height='23' src='../assets/images/avatar.jpg'
								width='23' /> <span class='user-name hidden-phone'>
									<s:property value="#session.worker.workerName"/> </span> <b class='caret'></b>
						</a>
							<ul class='dropdown-menu'>
								<li><a href='/HotelManager/worker/workerInfo.jsp'> <i class='icon-user'></i>
										Profile
								</a></li>
								<li><a href='#changePwd' data-toggle="modal"> <i
										class='icon-cog'></i> ChangePassword
								</a></li>
								<li class='divider'></li>
								<li><a href='/HotelManager/web/worker/workerlogin.jsp' data-transition="pop"> <i
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
				<form id="workerchangepwd" method="post" action="adminChangePwd">
					<div class="modal-body">

						<div class="alert alert-danger" role="alert">修改密码时请注意密码的安全</div>
						<hr>
						<h4>输入您现在使用的密码   <span class="label label-default">Old Pwd</span></h4>
						<h5></h5>
						<div class="input-group">
							<span class="input-group-addon">P</span> <input type="text"
								class="form-control" name="workerPassword" id="oldpassword"
								placeholder="old password">
						</div>
						<h4></h4>
						<hr>
						<h4></h4>
						<h4>输入您想要使用的密码  <span class="label label-default">New Pwd</span></h4>
						<h5></h5>
						<div class="input-group">
							<span class="input-group-addon">P</span> <input type="text"
								class="form-control" name="workerPassword" id="oldpassword"
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


	<jsp:include page="/web/js.jsp"></jsp:include>

</body>
</html>