<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>hotel 详情</title>
<s:if test="#session.user==null">
	<jsp:include page="/web/indexheader.jsp"></jsp:include>

</s:if>
<s:else>
	<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</s:else>
</head>
<body>
	<div class="container" style="margin-top: 50px">
		<div class='page-header'>

			<h2>
				<s:iterator value="#request.hotelInfo" id="hotel">
					<s:property value="#hotel.hotelName" />
				</s:iterator>
				<small> —— 欢迎您</small>
				<div class="btn-group">

					<button type="button" class="btn btn-primary"
						onclick="window.location.href='findHotelByCityAndName'">返回酒店列表</button>

				</div>

			</h2>

		</div>

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-7">
					<div class="container-fluid">
						<div class="span7 box">
							<table class="table table-bordered table-hover table-striped">
								<thread>
								<caption>所有空闲房间</caption>
								<tr>
									<th>房间号</th>
									<th>楼层</th>
									<th>房间类型</th>
									<th>房间空间</th>
									<th>房间价格</th>
									<th>床数量</th>
									<th>操作</th>

								</tr>
								</thread>
								<tbody>
									<s:iterator value="#request.roomlist" id="room">
										<tr>
											<td><s:property value="#room.roomNumber" /></td>
											<td><s:property value="#room.roomFllor" /></td>
											<td><s:property value="#room.roomType" /></td>
											<td><s:property value="#room.roomSize" /> m2</td>
											<td><s:property value="#room.roomPrice" /></td>
											<td><s:property value="#room.roomBedNum" /></td>
											<s:if test="#session.user==null">
												<td><a
												href="peopledoOrder?roomId=<s:property value="#room.roomId"/>&inDate=<s:property value="#session.intime"/>&outDate=<s:property value="#session.outtime"/>&days=<s:property value="#session.days"/>&hotelId=<s:property value="#request.hotelInfo.hotelId"/>&hotelName=<s:property value="#request.hotelInfo.hotelName"/>">预订</a></td>
											</s:if>
											<s:else>
												<td><a
												href="doOrder?roomId=<s:property value="#room.roomId"/>&userId=<s:property value="#session.user.userId"/>&inDate=<s:property value="#session.intime"/>&outDate=<s:property value="#session.outtime"/>&days=<s:property value="#session.days"/>&hotelId=<s:property value="#request.hotelInfo.hotelId"/>&hotelName=<s:property value="#request.hotelInfo.hotelName"/>">预订</a></td>
											</s:else>
										</tr>
									</s:iterator>
								</tbody>
							</table>
						</div>
						<hr>
						<div class="alert alert-warning alert-dismissible" role="alert">
							<button type="button" class="close" data-dismiss="alert">
								<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
							</button>
							<h3>
								<strong>提示</strong> 如果没有你想要的房间，你可以尝试更改时间
							</h3>
						</div>
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

	<jsp:include page="js.jsp"></jsp:include>
</body>
</html>