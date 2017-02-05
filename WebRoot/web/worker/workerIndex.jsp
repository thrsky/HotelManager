<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>旅店员工后台管理</title>

<jsp:include page="/web/worker/workerheader.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="page-header">
					<h3>订单管理</h3>
				</div>
				<div class="span6 box">
					<table class="table table-bordered table-hover table-striped">
						<thread>
						<caption>待审核订单</caption>
						<tr>
							<th>订单号</th>
							<th>用户</th>
							<th>创建日期</th>
							<th>入住日期</th>
							<th>离店日期</th>
							<th>房间号</th>
							<th>价格</th>
							<th>状态</th>
							<th>操作</th>
						</tr>
						</thread>
						<tbody>
							<s:iterator value="#request.daishenhelist" id="order">
								<tr>
									<td><s:property value="#order.orderId" /></td>
									<td><a data-toggle="modal" data-target="#userModal"><s:property
												value="#order.user.userId" /></a></td>
									<td><s:property value="#order.orderDate" /></td>
									<td><s:property value="#order.orderInDate" /></td>
									<td><s:property value="#order.orderOutDate" /></td>
									<td><s:property value="#order.roomByRoomId.roomId" /></td>
									<td><s:property value="#order.orderPrice" /></td>
									<td><s:property value="#order.orderStatus" /></td>
									<td><a
										href="agreeOrder?orderId=<s:property value="#order.orderId"/>&workerId=<s:property value="#session.worker.workerId"/>">接受申请</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
										href="notagreeOrder?orderId=<s:property value="#order.orderId"/>&workerId=<s:property value="#session.worker.workerId"/>"">拒绝申请</a></td>
								</tr>
								<div class="modal fade" id="userModal" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">用户信息</h4>
											</div>
											<div class="modal-body">
												<div class="row">
													<div class="col-md-1"></div>
													<div class="col-md-3">
														<h4>用户ID：</h4>
														<h4>用户名</h4>
														<h4>积分</h4>
														<h4>手机</h4>
														<h4>邮箱</h4>
														<h4>性别</h4>
														<hr>
													</div>
													<div class="col-md-7">
														<h4><s:property value="order.user.userId"/></h4>
														<h4><s:property value="order.user.userName"/></h4>
														<h4><s:property value="order.user.userIntegration"/></h4>
														<h4><s:property value="order.user.userPhone"/></h4>
														<h4><s:property value="order.user.userEmail"/></h4>
														<h4><s:property value="order.user.userGender"/></h4>
														<hr>
													</div>
													<div class="col-md-1"></div>
												</div>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
												<button type="button" class="btn btn-primary" data-dismiss="modal">了解了</button>
											</div>
										</div>
										<!-- /.modal-content -->
									</div>
									<!-- /.modal -->
								</div>
							</s:iterator>
						</tbody>
					</table>
					<hr>
					<table class="table table-bordered table-hover table-striped">
						<thread>
						<caption>历史订单</caption>
						<tr>
							<th>订单号</th>
							<th>用户</th>
							<th>创建日期</th>
							<th>入住日期</th>
							<th>离店日期</th>
							<th>房间号</th>
							<th>价格</th>
							<th>状态</th>
							
						</tr>
						</thread>
						<tbody>
							<s:iterator value="#request.allorderlist" id="order">
								<tr>
									<td><s:property value="#order.orderId" /></td>
									<td><s:property value="#order.user.userId" /></td>
									<td><s:property value="#order.orderDate" /></td>
									<td><s:property value="#order.orderInDate" /></td>
									<td><s:property value="#order.orderOutDate" /></td>
									<td><s:property value="#order.roomByRoomId.roomId" /></td>
									<td><s:property value="#order.orderPrice" /></td>
									<td><s:property value="#order.orderStatus" /></td>
									
								</tr>
								
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>

			<div class="col-md-1"></div>
		</div>
	</div>



</body>
</html>