<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>

<s:if test="#session.user==null">
	<jsp:include page="/web/indexheader.jsp"></jsp:include>
</s:if>
<s:else>
	<jsp:include page="/web/user/userheader.jsp"></jsp:include>
</s:else>
<link href="/HotelManager/web/time/bootstrap.min.css" rel="stylesheet">
<link href="/HotelManager/web/time/font-awesome.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="/HotelManager/web/time/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/HotelManager/web/time/moment.js"></script>
<script type="text/javascript"
	src="/HotelManager/web/time/daterangepicker.js"></script>
<link rel="stylesheet" type="text/css" media="all"
	href="/HotelManager/web/css/daterangepicker-bs3.css" />

</head>
<body>

	<div class="container" style="margin-top: 50px;">
		<div class="page-header">
			<h2>
				致力于每一个细节 <small>想你所享 </small>
			</h2>
		</div>

		<div class=container-fluid">
			<div class="row">
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
										<form id="FindHotelSearchCityName" method="post"
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
											<div class="btn-group">
												<button type="reset" class="btn btn-default btn-lg">重置</button>
												<button type="submit" class="btn btn-primary btn-lg"
													style="margin-left: 200px;">查询</button>
											</div>

										</form>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<div class="col-md-7">
					<div class="container-fluid">
						<div class="span7">
							<div class="row-fluid">
								<div class="span7 box">
									<div class="box-content box-double-padding"
										style="padding-top: 10px;">
										<form class="form-horizontal" role="form"
											action="findhotelByName" method="post">
											<h3>
												@ 向您推荐 <small> —— 世界很大 - 各有风情</small>
											</h3>
											<hr>
											<div id="citys" class="carousel slide">
												<!-- Indicators -->
												<ol class="carousel-indicators">
													<li data-target="#citys" data-slide-to="0" class="active"></li>
													<li data-target="#citys" data-slide-to="1"></li>
													<li data-target="#citys" data-slide-to="2"></li>
												</ol>

												<!-- Wrapper for slides -->
												<div class="carousel-inner">
													<div class="item active">
														<img src="/HotelManager/web/assets/images/shanghai.jpg"
															alt="">

													</div>
													<div class="item">
														<img src="/HotelManager/web/assets/images/beijing.jpg"
															alt="">

													</div>
													<div class="item">
														<img src="/HotelManager/web/assets/images/xianggang.jpg"
															alt="">

													</div>
												</div>
												<!-- Controls -->
												<a class="left carousel-control" href="#citys" role="button"
													data-slide="prev"> <span
													class="glyphicon glyphicon-chevron-left"></span> <span
													class="sr-only">Previous</span>
												</a> <a class="right carousel-control" href="#citys"
													role="button" data-slide="next"> <span
													class="glyphicon glyphicon-chevron-right"></span> <span
													class="sr-only">Next</span>
												</a>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- /container -->
</body>
</html>