<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>AdminIndex</title>
<jsp:include page="adminIndex.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>

			<div class="col-md-10">
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="page-header">
								<h1 class='pull-left'>
									<i class='icon-user'></i> User profile
								</h1>
								<div class='pull-right'>

									<ul class='breadcrumb'>
										<li><a href="index.html"><i class='icon-bar-chart'></i>
										</a></li>
										<li class='separator'><i class='icon-angle-right'></i></li>
										<li>admin page</li>
										<li class='separator'><i class='icon-angle-right'></i></li>
										<li class='active'>admin User profile</li>
									</ul>
								</div>
							</div>
							<div class='row-fluid'>
								<div class='span12 box'>
									<div class='box-content box-double-padding'>
										<form class='form' action="adminChangeInfo" method="post">
											<fieldset>
												<div class='span4'>
													<div class='lead'>
														<i class='icon-signin text-contrast'></i> Login info
													</div>
													<small class='muted'>Lorem ipsum dolor sit amet,
														consectetur adipiscing elit. Donec nisl est, vulputate at
														porttitor non, interdum a mauris. Phasellus imperdiet
														gravida pulvinar.</small>

												</div>
												<hr class="hr-normal">
												<div class='span7 offset1'>
													<div class='control-group'>
														<label class='control-label'>Username</label>
														<div class="input-group">
															<span class="input-group-addon">@</span> <input
																type="text" class="form-control" name="adminUserName"
																placeholder="Username">
														</div>
													</div>
													<div class='control-group'>
														<label class='control-label'>E-mail</label>
														<div class="input-group">
															<span class="input-group-addon">@</span> <input
																type="text" class="form-control" name="adminEmail"
																placeholder="E-mail">
														</div>
													</div>
													<div class='control-group'>
														<label class="control-label">I-Phone</label>
														<div class="input-group">
															<span class="input-group-addon">@</span> <input
																type="text" class="form-control" name="adminPhone"
																placeholder="I-phone">
														</div>
													</div>

												</div>
											</fieldset>
											<hr class='hr-normal' />
											<fieldset>
												<div class='span4 box'>
													<div class='lead'>
														<i class='icon-user text-contrast'></i> Personal info
													</div>
													<small class='muted'>Proin eu nibh ut urna
														tristique rhoncus. Sed euismod, quam sed dignissim
														imperdiet, nulla leo vehicula mi, a sagittis lacus augue
														nec sapien.</small>
												</div>
												<div class='span7 offset1'>
													<div class='control-group'>
														<label class='control-label'>Real Name</label>
														<div class="input-group">
															<span class="input-group-addon">@</span> <input
																type="text" class="form-control" name="adminRealName"
																placeholder="Real-Name">
														</div>
													</div>

												</div>
											</fieldset>
											<hr class="hr-normal">
											<div class='form-actions' style='margin-bottom: 20;'>
												<button type="submit" class="btn btn-primary"
													style="margin-left: 450px">提交更改</button>

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
	</div>
</body>
</html>