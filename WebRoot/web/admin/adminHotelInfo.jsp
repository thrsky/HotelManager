<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hotel manager</title>
<jsp:include page="/web/admin/adminIndex.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>

			<div class="col-md-10">
				<div class="container-fluid">
					<div class="row-fluid">
						<hr>
						<h3>
							下面是全部酒店&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#newHotel"
								data-toggle="modal" class="btn btn-default">新增酒店</a>
						</h3>
						<hr>
						<div class="modal fade" id="newHotel" tabindex="-1" role="dialog"
							aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">新增酒店</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-1"></div>
											<div class="col-md-10">
												<form class="bs-example bs-example-form" role="form"
													action="newHotel" method="post">
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="酒店名"
															name="hotelName">
													</div>
													<br>
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="酒店所在城市"
															name="hotelCity">
													</div>
													<br>
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="街道"
															name="hotelPosition">
													</div>
													<br>
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="联系方式"
															name="hotelPhone">
													</div>
													<br>
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="负责人"
															name="hotelAdmin">
													</div>
													<br>
													<div class="input-group">
														<span class="input-group-addon">@</span> <input
															type="text" class="form-control" placeholder="详情"
															name="hotelDescription">
													</div>
													<br>
													<div class="modal-footer">
														<button type="button" class="btn btn-default"
															data-dismiss="modal">关闭</button>
														<button type="submit" class="btn btn-primary">提交</button>
												</form>
											</div>
											<div class="col-md-1"></div>
										</div>
									</div>

								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal -->
					</div>
					<div class="table-responsive">
						<table class="table table-bordered table-hover table-striped">
							<caption>All Hotel</caption>
							<thead>
								<tr>
									<th>ID</th>
									<th>名称</th>
									<th>城市</th>
									<th>街道</th>
									<th>评分</th>
									<th>最低价</th>
									<th>电话</th>
									<th>状态</th>
									<th>操作</th>
									<th>留言</th>
									<th>员工</th>
								</tr>
							</thead>
							<tbody>

								<s:iterator value="#request.allhotel" id="Hotel">
									<tr>
										<th><s:property value="#Hotel.hotelId" /></th>
										<th><s:property value="#Hotel.hotelName" /></th>
										<th><s:property value="#Hotel.hotelCity" /></th>
										<th><s:property value="#Hotel.hotelPosition" /></th>
										<th><s:property value="#Hotel.hotelMark" /></th>
										<th><s:property value="#Hotel.hotelMinimum" /></th>
										<th><s:property value="#Hotel.hotelPhone" /></th>
										<th><s:property value="#Hotel.hotelStatus" /></th>
										<s:if test="#Hotel.hotelStatus=='营业'">
											<th><a
												href="changeHotelStatus?hotelId=<s:property value="#Hotel.hotelId"/>">关闭</a></th>
										</s:if>
										<s:else>
											<th><a
												href="changeHotelStatus?hotelId=<s:property value="#Hotel.hotelId" />">恢复</a></th>
										</s:else>
										<th><a
											href="findMessageByHotelId?hotelId=<s:property value="#Hotel.hotelId" />">留言</a></th>
										<th><a
											href="findWorkerByHotelId?hotelId=<s:property value="#Hotel.hotelId" />">员工</a></th>
								</s:iterator>
							</tbody>


						</table>
					</div>

				</div>

			</div>
		</div>

	</div>

	</div>
</body>
</html>