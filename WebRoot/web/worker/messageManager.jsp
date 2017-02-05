<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>旅店留言查看</title>
<jsp:include page="/web/worker/workerheader.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="page-header">
					<h3>留言查看</h3>
				</div>
				<div class="span6 box">				
					<table class="table table-bordered table-hover table-striped">
						<thread>
						<caption>历史留言</caption>
						<tr>
							<th>编号</th>
							<th>内容</th>
							<th>留言日期</th>
							<th>用户编号</th>
							
						</tr>
						</thread>
						<tbody>
							<s:iterator value="#request.messagelist" id="message">
								<tr>
									<td><s:property value="#message.messageId" /></td>
									<td><s:property value="#message.messageValue" /></td>
									<td><s:property value="#message.messageDate" /></td>
									<td><s:property value="#message.user.userId" /></td>								
								</tr>						
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>

			<div class="col-md-1"></div>
		</div>
	</div>
	
</body>
</html>