<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>订单列表</title>
<s:if test="session.user==null">
	<jsp:include page="/web/indexheader.jsp"></jsp:include>

</s:if>
<s:else>
	<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</s:else>
</head>
<body>
	<div class="container-fluid" style="margin-top: 30px">
		<div class="page-header">
			<div class="row">
				<form id="searchOrderByValues" method="post"
					action="findOrdersByValues">
					<div class="col-md-10">
						<div class="container-fluid">
							<div class="span10 box">
								<div class="col-lg-4">
									<div class="input-group" style="margin-left: 60px">
										<span class="input-group-addon"> <input type="checkbox">

										</span> <input type="text" class="form-control" name="userName"
											placeholder="用户名">
									</div>
								</div>
								<div class="col-lg-4">
									<div class="input-group">
										<span class="input-group-addon"> <input type="checkbox">

										</span> <input type="text" class="form-control" name="userPhone"
											placeholder="手机号">
									</div>
								</div>
								<div class="col-lg-4">
									<div class="input-group">
										<span class="input-group-addon"> <input type="checkbox">

										</span> <input type="text" class="form-control" name="userIdnumber"
											placeholder="身份证号">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="row">
							<div class="container-fluid">
								<button type="submit" class="btn btn-primary">搜索</button>
								<a class='btn btn-default'  style="margin-left: 30px" href="/HotelManager/web/hotelIndex.jsp">去订房间<a>
							</div>
						</div>
					</div>
				</form>

			</div>
		</div>
		<div class="container-fluid">
			<div class="row text-center">
				<div class="center-block">
					<div class="col-md-2"></div>
					<div class="col-md-8">
						<div class="container-fluid">
							<h3>下面是您的历史订单信息</h3>
							<table class="table table-bordered">
								<thread>
								<tr>

									<th>编号</th>
									<th>状态</th>
									<th>时间</th>
									<th>城市</th>
									<th>酒店</th>
									<th>价格</th>
									<th>操作</th>
								</tr>
								</thread>
								<tbody>
									<s:iterator value="#request.orderlist" id="Order">
										<tr>
											<th><s:property value="#Order.orderId" /></th>
											<th><s:property value="#Order.orderStatus" /></th>
											<th><s:property value="#Order.orderDate" /></th>
											<th><s:property
													value="#Order.roomByRoomId.hotel.hotelCity" /></th>
											<th><s:property
													value="#Order.roomByRoomId.hotel.hotelName" /></th>
											<th><s:property value="#Order.orderPrice" /></th>
											<th>查看</th>
									</s:iterator>
								</tbody>
							</table>
						</div>
					</div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>