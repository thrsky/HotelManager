<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>旅店员工信息管理</title>
<jsp:include page="/web/admin/adminIndex.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>

			<div class="col-md-10">
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="row-fluid">
								<div class='span12 box'>
									<br>
								
									<h2>
										下面是该旅店的全部员工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small><a
											href="#newWorker" data-toggle="modal" class="btn btn-default">增加员工</a></small>
									</h2>
									<hr>
									<div class="modal fade" id="newWorker" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">新增员工</h4>
												</div>
												<div class="modal-body">
													<div class="row">
														<div class="col-md-1"></div>
														<div class="col-md-10">
															<form class="bs-example bs-example-form" role="form"
																method="post"
																action="newWorker?hotelId=<s:property value="#request.hotelId"/>">
																<div class="input-group">
																	<span class="input-group-addon">@</span> <input
																		type="text" class="form-control" placeholder="员工昵称" name="workerName">
																</div>
																<br>
																<div class="alert alert-info">所以用户初始密码均为123456</div>
																<br>
														</div>
														<div class="col-md-1"></div>
													</div>

												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">关闭</button>
													<button type="submit" class="btn btn-primary">创建用户</button>
												</div>
												</form>
											</div>
											<!-- /.modal-content -->
										</div>
										<!-- /.modal -->
									</div>

									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<caption>All Worker</caption>
											<thead>
												<tr>
													<th>ID</th>
													<th>用户名</th>
													<th>邮箱</th>
													<th>手机</th>
													<th>性别</th>
													<th>操作</th>
												</tr>
											</thead>

											<tbody>
												<s:iterator value="#request.workerList" id="User">
													<tr>
														<td><s:property value="#User.workerId" /></td>
														<td><s:property value="#User.workerName" /></td>
														<td><s:property value="#User.workerEmail" /></td>
														<td><s:property value="#User.workerPhone" /></td>
														<td><s:property value="#User.workerGender" /></td>
														<td><a
															href="deleteWorker?workerId=<s:property value="#User.workerId"/>">删除</a></td>
													</tr>
												</s:iterator>
											</tbody>
										</table>
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