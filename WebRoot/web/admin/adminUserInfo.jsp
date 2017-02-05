<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册用户信息管理</title>
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
									<div class='box-content box-double-padding'
										style="padding-top: 20px; padding-bottom: 0px;">
										<from id="searchUser" method="post" action="FindUserByName">
										<div class="span7 offset1">
											<div class='control-group'>
												<div class="input-group">
													<span class="input-group-addon">@</span><input type="text"
														class="form-control" name="userName"
														placeholder="按用戶名搜索用戶"> <span
														class="input-group-addon"> <i
														class="glyphicon glyphicon-search"></i>
													</span>
												</div>
											</div>
										</div>

										<div class="container"></div>
										</from>
										<hr class="hr-normal">
									</div>
									<h4>下面是全部用戶</h4>
									<hr>

									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<caption>All User</caption>
											<thead>
												<tr>
													<th>ID</th>
													<th>用户名</th>
													<th>邮箱</th>
													<th>手机</th>
													<th>性别</th>
													<th>积分</th>
													<th>操作</th>
												</tr>
											</thead>
												
											<tbody>
											<s:iterator value="#request.alluserList" id="User">
												<tr>
													<td><s:property value="#User.userId"/></td>
													<td><s:property value="#User.userName"/></td>
													<td><s:property value="#User.userEmail"/></td>
													<td><s:property value="#User.userPhone"/></td>
													<td><s:property value="#User.userGender"/></td>
													<td><s:property value="#User.userIntegration"/></td>
													<td><a href="deleteUser?userId=<s:property value="#User.userId"/>">删除</a></td>
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