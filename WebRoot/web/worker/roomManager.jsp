<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>房间管理</title>

<jsp:include page="/web/worker/workerheader.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="page-header">
					<h3>
						房间管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-default" data-toggle="modal" href="#addroom">增加房间</a>
					</h3>
				</div>
				<div class="modal fade" id="addroom" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">增加房间</h4>
							</div>
							<div class="modal-body">
								<div class="row">
									<div class="col-md-1"></div>
									<div class="col-md-10">
										<form class="bs-example bs-example-form" method="post" role="form" action="addRoom?workerId=<s:property value="#session.worker.workerId"/>">
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间号" name="roomNumber">
											</div>
											<br>
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间类型" name="roomType">
											</div>
											<br>
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间大小" name="roomSize">
											</div>
											<br>
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间订价" name="roomPrice">
											</div>
											<br>
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间信息" name="roomInfo">
											</div>
											<br>
											<div class="input-group">
												<span class="input-group-addon">@</span> <input type="text"
													class="form-control" placeholder="房间床数" name="roomBedNum">
											</div>
											<br>
									</div>
									<div class="col-md-1"></div>
								</div>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
								<button type="submit" class="btn btn-primary">提交</button>
							</div>
							</form>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal -->
				</div>
				<div class="span6 box">
					<table class="table table-bordered table-hover table-striped">
						<thread>
						<caption>所有房间</caption>
						<tr>
							<th>房间ID</th>
							<th>房间号</th>
							<th>楼层</th>
							<th>空间</th>
							<th>类型</th>
							<th>价格</th>
							<th>床数</th>
							<th>描述</th>
							<th>状态</th>
							<th>操作</th>
						</tr>
						</thread>
						<tbody>
							<s:iterator value="#request.allroomlist" id="Room">
								<tr>
									<td><s:property value="#Room.roomId" /></td>
									<td><s:property value="#Room.roomNumber" /></td>
									<td><s:property value="#Room.roomFllor" /></td>
									<td><s:property value="#Room.roomSize" /></td>
									<td><s:property value="#Room.roomType" /></td>
									<td><s:property value="#Room.roomPrice" /></td>
									<td><s:property value="#Room.roomBedNum" /></td>
									<td><s:property value="#Room.roomInfo" /></td>
									<td><s:if test="#Room.roomStatus==1">空闲</s:if> <s:else>
											<s:if test="#Room.roomStatus==2">关闭</s:if>
											<s:else>繁忙</s:else>
										</s:else></td>
									<td><s:if test="#Room.roomStatus==1">
											<a
												href="closeRoom?roomId=<s:property value="#Room.roomId"/>&workerId=<s:property value="#session.worker.workerId"/>">关闭</a>
										</s:if> <s:else>
											<s:if test="#Room.roomStatus==2">
												<a
													href="openRoom?roomId=<s:property value="#Room.roomId"/>&workerId=<s:property value="#session.worker.workerId"/>">打开</a>
											</s:if>
											<s:else>
												<a href="#roomInfo" data-toggle="modal">查看</a>
											</s:else>
										</s:else></td>
								</tr>
								<div class="modal fade" id="roomInfo" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">房间信息</h4>
											</div>
											<div class="modal-body">
												<div class="row">
													<div class="col-md-1"></div>
													<div class="col-md-3">
														<h4>房间ID</h4>
														<h4>房间号</h4>
														<h4>楼层</h4>
														<h4>空间</h4>
														<h4>类型</h4>
														<h4>价格</h4>
														<h4>床数</h4>
														<h4>描述</h4>
														<h4>状态</h4>
														<hr>
													</div>
													<div class="col-md-7">
														<h4>
															<s:property value="#Room.roomId" />
														</h4>
														<h4>
															<s:property value="#Room.roomNumber" />
														</h4>
														<h4>
															<s:property value="#Room.roomFllor" />
														</h4>
														<h4>
															<s:property value="#Room.roomSize" />
														</h4>
														<h4>
															<s:property value="#Room.roomType" />
														</h4>
														<h4>
															<s:property value="#Room.roomPrice" />
														</h4>
														<h4>
															<s:property value="#Room.roomBedNum" />
														</h4>
														<h4>
															<s:property value="#Room.roomInfo" />
														</h4>
														<h4>
															<s:property value="#Room.roomStatus" />
														</h4>
														<hr>
													</div>
													<div class="col-md-1"></div>
												</div>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
												<button type="button" class="btn btn-primary"
													data-dismiss="modal">了解了</button>
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
				</div>
			</div>

			<div class="col-md-1"></div>
		</div>
	</div>

</body>
</html>