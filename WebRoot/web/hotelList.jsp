<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hotel 列表</title>
<link href="/HotelManager/web/time/bootstrap.min.css" rel="stylesheet">
<link href="/HotelManager/web/time/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="/HotelManager/web/time/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/HotelManager/web/time/moment.js"></script>
<script type="text/javascript" src="/HotelManager/web/time/daterangepicker.js"></script>
<link rel="stylesheet" type="text/css" media="all"
	href="/HotelManager/web/css/daterangepicker-bs3.css" />
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
			<h2>以下是符合您要求的旅店信息</h2>
		</div>


		<div class="container-fluid">
			<div class="row">
				<div class="col-md-7">
					<div class="container-fluid">
						<div class="span7 box">
							<table class="table table-bordered table-hover">
								<thread>
								<tr>
									<th>酒店名称</th>
									<th>城市</th>
									<th>联系方式</th>
									<th>具体位置</th>
									<th>评分</th>
									<th>最低价</th>
									<th>操作</th>

								</tr>
								</thread>
								<tbody>
									<s:iterator value="#request.list" id="hotel">
										<tr>
											<td><s:property value="#hotel.hotelName" /></td>
											<td><s:property value="#hotel.hotelCity" /></td>
											<td><s:property value="#hotel.hotelPhone" /></td>
											<td><s:property value="#hotel.hotelPosition" /></td>
											<td><s:property value="#hotel.hotelMark" /></td>
											<td><s:property value="#hotel.hotelMinimum" /></td>
											<td><a
												href="hotelPage?hotelId=<s:property value="#hotel.hotelId"/>&orderInDate=<s:property value="#session.intime"/>&orderOutDate=<s:property value="#session.outtime"/>">查看</a></td>
										</tr>
									</s:iterator>
								</tbody>

							</table>
							<hr>
							<div class="alert alert-warning alert-dismissible" role="alert">
								<button type="button" class="close" data-dismiss="alert">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<h3><strong>提示</strong> 如果没有你想要的信息，你可以减少搜索条件</h3>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-5">
					<div class="container-fluid">
						<div class="span4">
							<div class="row-fluid">
								<div class="span4 box">
									<div class="box-content box-double-padding"
										style="padding-top: 10px;">
										<h3>
											#Search Hotel<small> —— 两项均可不填 </small>
										</h3>
										<hr>
										<form id="FindSearchCityName" method="post"
											action="findHotelByCityAndName">
											<div class="input-group">
												<span class="input-group-addon">City</span> <input
													type="text" class="form-control" placeholder="选择城市"
													name="hotelCity">
											</div>
											<hr>
											<div class="input-group">
												<span class="input-group-addon">Name</span> <input
													type="text" class="form-control" placeholder="输入酒店名"
													name="hotelName">
											</div>
											<hr>
											<div class="well">
												<div class="input-prepend input-group">
													<span class="add-on input-group-addon"><i
														class="glyphicon glyphicon-calendar fa fa-calendar"></i></span> <input
														type="text" readonly style="width: 200px" name="time"
														id="reservation" class="form-control"
														value="2016-12-26 - 2016-12-27" />
												</div>
												<script type="text/javascript">
													$(document)
															.ready(
																	function() {
																		$(
																				'#reservation')
																				.daterangepicker(
																						null,
																						function(
																								start,
																								end,
																								label) {
																							console
																									.log(
																											start
																													.toISOString(),
																											end
																													.toISOString(),
																											label);
																						});
																	});
												</script>
											</div>
											<div class="input-group">
												<button type="submit" class="btn btn-primary btn-block"
													style="margin-left: 95px;">查询</button>
											</div>


										</form>
									</div>
								</div>

								<div class="span4 box">
									<div class="box-content box-double-padding"
										style="padding-top: 5px;">
										<h3>
											#热门酒店<small> —— 实时更新 </small>
										</h3>
										<hr>

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
<jsp:include page="/web/js.jsp"></jsp:include>
</html>