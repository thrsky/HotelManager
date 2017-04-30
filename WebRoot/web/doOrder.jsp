<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Finish Order</title>
<s:if test="#session.user==null">
	<jsp:include page="/web/indexheader.jsp"></jsp:include>

</s:if>
<s:else>
	<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</s:else>
<script>
	function myFunc() {
		var idinteger = document.getElementById("userIntegration").value;
		var oldprice ='<%=session.getAttribute("price")%>';
		var haveIt='<%=session.getAttribute("haveIt")%>';
		var x = 20;
		var ol = parseInt(oldprice);
		var it = parseInt(idinteger);
		var ha = parseInt(haveIt);
		var nPrice = ol - it / x;
		if (it < 0 || it > ha) {
			alert("请输入正确的积分数");
			return false;
			
		}
		document.getElementById("newprice").innerHTML = nPrice;
		
	}
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="page-header"></div>

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-6">
					<div class="container-fluid">
						<div class="span8 box">
							<h2>
								<s:property value="#request.hotelName" />
								<small>欢迎您的光临 &nbsp;&nbsp;&nbsp;&nbsp;</small><a
									href="hotelPage?hotelId=<s:property value="#request.hotelId"/>"
									class="btn btn-primary">返回上一层</a>
							</h2>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;确认你的订单信息</h3>
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-3">
										<div class="container-fluid">
											<h4>门号:</h4>
											<h4>楼层:</h4>
											<h4>类型:</h4>
											<h4>空间:</h4>
											<h4>床数:</h4>
											<h4>入住:</h4>
											<h4>离店:</h4>
											<h4>共居住：</h4>
											<hr>
											<h4>所需金额:</h4>
										</div>
									</div>
									<s:iterator value="#request.doOrder" id="room">
										<div class="col-md-9">
											<h4>
												<s:property value="#room.roomNumber" />
											</h4>
											<h4>
												<s:property value="#room.roomFllor" />
											</h4>
											<h4>
												<s:property value="#room.roomType" />
											</h4>
											<h4>
												<s:property value="#room.roomSize" />
												m2
											</h4>

											<h4>
												<s:property value="#room.roomBedNum" />
											</h4>
											<h4>
												<s:property value="#session.intime" />
											</h4>
											<h4>
												<s:property value="#session.outtime" />
											</h4>
											<h4>
												<s:property value="#session.days" />
												天
											</h4>
											<hr>
									</s:iterator>
									<h4>
										<s:property value="#session.price" />
									</h4>

								</div>
							</div>
						</div>
						<hr>
						<div class="alert alert-danger" role="alert">
							<h4>请确认信息，一经确认无法修改</h4>
						</div>

					</div>
				</div>
			</div>
			<div class="col-md-4">
				<s:if test="#session.user==null">
					<div class="alert alert-warning">
						<a href="#" class="close" data-dismiss="alert"> &times;</a>
						<h4>建议你注册或登录，以享受积分服务</h4>
					</div>
					<a href="/HotelManager/web/user/userlogin.jsp"
						class="btn btn-default btn-md">去登录</a>
					<a href="/HotelManager/web/user/userRegister.jsp"
						class="btn btn-default btn-md">去注册</a>
					<br>
					<h4>你可以选择输入以下信息</h4>
					<div class="input-group">
						<s:iterator value="#request.doOrder" id="room">
							<form class="bs-example bs-example-form" role="form"
								method="post"
								action="peopleNewOrder?roomId=<s:property value="#room.roomId"/>&inDate=<s:property value="#session.intime"/>&outDate=<s:property value="#session.outtime"/>&days=<s:property value="#session.days"/>&hotelId=<s:property value="#request.hotelId"/>&hotelName=<s:property value="#request.hotelName"/>"">
						</s:iterator>
						<br>
						<div class="input-group">
							<span class="input-group-addon">@</span> <input type="text"
								class="form-control" placeholder="手机号" name="userPhone">
						</div>
						<br>

						<div class="input-group">
							<span class="input-group-addon">@</span> <input type="text"
								class="form-control" placeholder="身份证号" name="userIdnumber">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">@</span> <input type="text"
								class="form-control" placeholder="备注" name="remark">
						</div>
						<br>
						<button type="submit" style="margin-left: 80px;"
							class="btn btn-default" onclick="myFunc()">提交订单</button>
						</form>

					</div>
				</s:if>
				<s:else>
					<h3>
						会员
						<s:property value="#session.user.userName" />
					</h3>
					<h4>
						你的账户剩余
						<s:property value="#session.user.userIntegration" />
						点积分，可享受每200积分折扣10的优惠
					</h4>
					<s:iterator value="#request.doOrder" id="room">
						<form
							action="userNewOrder?roomId=<s:property value="#room.roomId"/>&userId=<s:property value="#session.user.userId"/>&inDate=<s:property value="#session.intime"/>&outDate=<s:property value="#session.outtime"/>&days=<s:property value="#session.days"/>&hotelId=<s:property value="#request.hotelId"/>&hotelName=<s:property value="#request.hotelName"/>"
							method="post">
					</s:iterator>
					<br>
					<div class="input-group">
						<span class="input-group-addon">@</span> <input type="text"
							class="form-control" placeholder="想要使用的积分"
							name="userusedIntegration" id="userIntegration" value="0">
					</div>
					<br>
					<br>
					<div class="input-group">
						<span class="input-group-addon">@</span> <input type="text"
							class="form-control" placeholder="备注" name="remark" id="remark">
					</div>
					<br>
					<button type="button" class="btn btn-default" data-toggle="modal"
						data-target="#myModal" onclick="myFunc()">提交订单</button>

					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h3 class="modal-title" id="myModalLabel">确认付款</h3>
									<div class="modal-body">
										<h4>
											应付金额:<span><del>
													<s:property value="#session.price" />
												</del></span>
										</h4>
										<h4>
											实付金额:<span><p id="newprice"></p></span>
										</h4>

									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
										<button type="submit" class="btn btn-default">确认付款</button>

									</div>
								</div>
							</div>
						</div>

					</div>
					</form>
				</s:else>
			</div>
		</div>
	</div>
	</div>
</body>
</html>