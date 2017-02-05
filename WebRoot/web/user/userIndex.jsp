<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人主页</title>
<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid" style="margin-top: 50px">
		<div class='page-header'>
			<h2><a href="#userInfo" class="btn btn-default" data-toggle="modal"> 查看个人信息</a></h2>
		</div>
		
								<div class="modal fade" id="userInfo" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">个人信息</h4>
											</div>
											<div class="modal-body">
												<div class="col-md-1"></div>
												<div class="col-md-4">
													<br>
													<h4>ID</h4>
													<h4>用户名</h4>
													<h4>姓名</h4>
													<h4>手机</h4>
													<h4>邮箱</h4>
													<h4>身份证</h4>
													<h4>性别</h4>
													<h4>积分</h4>
													<hr>
												</div>
												<div class="col-md-1"></div>
												<div class="col-md-5">
												<br>
													<h4>
														<s:property value="#session.user.userId" />
													</h4>
													<h4>
														<s:property value="#session.user.userName" />
													</h4>
													<h4>
														<s:if test="#session.user.userRealname==''">
														无
														</s:if>
														<s:else>
														
														<s:property value="#session.user.userRealname" />
														</s:else>
													</h4>
													<h4>
														<s:if test="#session.user.userPhone==''">
														无
														</s:if>
														<s:else>
														
														<s:property value="#session.user.userPhone" />
														</s:else>
													</h4>
													<h4>
														<s:if test="#session.user.userEmail==''">
														无
														</s:if>
														<s:else>
														
														<s:property value="#session.user.userEmail" />
														</s:else>
													</h4>
													<h4>
														<s:if test="#session.user.userIdnumber==''">
														无
														</s:if>
														<s:else>
														
														<s:property value="#session.user.userIdnumber" />
														</s:else>
													</h4>
													<h4>
														<s:if test="#session.user.userGender==''">
														无
														</s:if>
														<s:else>
														
														<s:property value="#session.user.userGender" />
														</s:else>
													</h4>
													<h4>
														<s:property value="#session.user.userIntegration" />
													</h4>
													<hr>
												</div>
												<div class="col-md-1"></div>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>

											</div>
										</div>
										<!-- /.modal-content -->
									</div>
									<!-- /.modal -->
								</div>
		
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-10">
					<div class="container-fluid">
						<h3>下面是您的历史订单信息</h3>
						<table class="table table-bordered">
							<thread>
							<tr>

								<th>编号</th>
								<th>状态</th>
								<th>订单创建时间</th>
								<th>入住时间</th>
								<th>离店时间</th>
								<th>所在城市</th>
								<th>酒店</th>
								<th>价格</th>
								<th>操作</th>
							</tr>
							</thread>
							<tbody>
								<s:iterator value="#request.orderlistbyuserid" id="Order">
									<tr>
										<th><s:property value="#Order.orderId" /></th>
										<th><s:property value="#Order.orderStatus" /></th>
										<th><s:property value="#Order.orderDate" /></th>
										<th><s:property value="#Order.orderInDate" /></th>
										<th><s:property value="#Order.orderOutDate" /></th>
										<th><s:property
												value="#Order.roomByRoomId.hotel.hotelCity" /></th>
										<th><s:property
												value="#Order.roomByRoomId.hotel.hotelName" /></th>
										<th><s:property value="#Order.orderPrice" /></th>
										<s:if test="#Order.orderStatus=='进行中'">
											<th><a
												href="finishOrder?orderId=<s:property value="#Order.orderId" />">完成</a></th>
										</s:if>
										<s:else>
											<s:if test="#Order.orderStatus=='待审核'">
												<th><a
													href="cancelOrder?orderId=<s:property value="#Order.orderId"/>"
													>取消</a></th>
											</s:if>
											<s:else>
												<th>已完成</th>
											</s:else>
										</s:else>

								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>