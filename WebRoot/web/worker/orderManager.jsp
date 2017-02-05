<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单管理</title>
<jsp:include page="/web/worker/workerheader.jsp"></jsp:include>
</head>
<body>

	<div class="container" style="margin-top: 50px">
		<div class='page-header'>
			<h2>你可以在这里接受订单和管理订单</h2>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-7">
					<div class="container-fluid">
						<div class="span7 box">
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
											<td><s:property value="#order.userId" /></td>
											<td><s:property value="#order.orderDate" /></td>
											<td><s:property value="#order.orderInDate" /></td>
											<td><s:property value="#order.orderOutDate" /></td>
											<td><s:property value="#order.roomId" /></td>
											<td><s:property value="#order.price" /></td>
											<td><s:property value="#order.orderStatus"/></td>
											<td><a>接受申请</a><a>拒绝申请</a></td>										
										</tr>
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
									<th>操作</th>
								</tr>
								</thread>
								<tbody>
									<s:iterator value="#request.allorderlist" id="order">
										<tr>
											<td><s:property value="#order.orderId" /></td>
											<td><s:property value="#order.userId" /></td>
											<td><s:property value="#order.orderDate" /></td>
											<td><s:property value="#order.orderInDate" /></td>
											<td><s:property value="#order.orderOutDate" /></td>
											<td><s:property value="#order.roomId" /></td>
											<td><s:property value="#order.price" /></td>
											<td><s:property value="#order.orderStatus"/></td>
											<td><a>查看详情</a></td>										
										</tr>
									</s:iterator>
								</tbody>
							</table>
						</div>
						<hr>
					</div>
				</div>

				<div class="col-md-5">
					<div class="container-fluid">
						<div class="span5">
							<div class="row-fluid">
								<div class="span5 box">
									<div class="box-content box-double-padding"
										stype="padding-top:10px"">
										<form class="form">
											<fieldset>
												<s:iterator value="#request.hotelInfo" id="hotel">
													<div class="span4">
														<div class="lead">
															<h3>酒店详情</h3>
														</div>
														<hr>
														<h4 class='muted'>
															<s:property value="#hotel.hotelDescription" />
														</h4>
														<hr>
														<h3>热门评论</h3>
														<hr>

														<h4>
															<s:property value="#hotel.hotelComment" />
														</h4>

														<hr>
													</div>
												</s:iterator>
												<div class="span1"></div>
											</fieldset>
										</form>


									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

	</div>
</body>
</html>