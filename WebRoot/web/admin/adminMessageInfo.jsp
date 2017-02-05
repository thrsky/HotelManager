<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言管理</title>
</head>
<jsp:include page="/web/admin/adminIndex.jsp"></jsp:include>
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
											
										</div>

										<div class="container"></div>
										</from>
										<hr class="hr-normal">
									</div>
									<h4>下面是该旅店的全部留言</h4>
									<hr>

									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<caption>All Message</caption>
											<thead>
												<tr>
													<th>ID</th>
													<th>内容</th>
													<th>用户</th>
													<th>旅店</th>
													<th>操作</th>
												</tr>
											</thead>

											<tbody>
												<s:iterator value="#request.messagelistinAdmin" id="message">
													<tr>
														<td><s:property value="#message.messageId" /></td>
														<td><s:property value="#message.messageValue" /></td>
														<td><s:property value="#message.user.userId" /></td>
														<td><s:property value="#message.hotel.hotelName" /></td>
														<td><a
															href="deleteMessage?messageId=<s:property value="#message.messageId"/>">删除</a></td>
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