<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!DOCTYPE html>
   <%@ taglib prefix ="s" uri="/struts-tags"%>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login, registration forms">
    <meta name="author" content="Seong Lee">

    <title>AdminLogin</title>
    
    <jsp:include page="../css.jsp"></jsp:include>
    
  </head>
  <body>
			<section id="signin_alt" class="authenty signin-alt" style="height: 738px;">
				<div class="section-content">
				  <div class="wrap" style="padding-top: 100px;">
					  <div class="container">
							<div class="row" data-animation="fadeInUp">
							  <div class="col-md-4 col-md-offset-1">
									<div class="normal-signin"> 
										<div class="title">
											<h3>Sign In As Admin</h3>
										</div> 
									  <form id="form" method="post" action="adminlogin">
									  <div class="form-main">
										  <div class="form-group">
												<div class="un-wrap">
													<i class="fa fa-user"></i>
											  			<input type="text" class="form-control" placeholder="name" name="adminUserName" id="adminUserName" required="required">
												</div>
												<div class="pw-wrap">
													<i class="fa fa-lock"></i>
											  			<input type="password" class="form-control" placeholder="Password" name="adminPassword" id="adminPassword" required="required">
												</div>
												
												<div class="row top-buffer">
													<div class="col-md-4 col-md-offset-8">
										    			<button type="submit" class="btn btn-block signin">Sign In</button>
													</div>
												</div>
									  	   </div>
										</div>
										</form>		
							  	</div>
								</div>
								<div class="col-md-2">
									<div class="horizontal-divider"></div>
								</div>
								<div class="col-md-4">
									<div class="sns-signin">
										<a href="../user/userlogin.jsp" class="facebook"><i class="fa fa-facebook"></i><span>Sign in As User</span></a>
										<a href="../worker/workerlogin.jsp" class="google-plus"><i class="fa fa-google-plus"></i><span>Sign in As Worker</span></a>
									</div>
								</div>
								<div class="col-md-1"></div>
							</div>
							<div class="row top-buffer bottom-wrap">
								<div class="col-xs-6 col-md-2 col-md-offset-1">
									<a href="#password_recovery" id="forgot_from_2">need help?</a>
								</div>
								<div class="col-xs-6 col-md-2">
									<a href="#signup_wizard" id="signup_from_2">Create an account</a>
								</div>
								<div class="col-xs-6 col-md-2">
								
								</div>
								<div class="col-xs-6 col-md-2">
								
								</div>
								<div class="col-xs-6 col-md-2">
									版权所有 copyright@2016-2017 likang
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
		<jsp:include page="../js.jsp"></jsp:include>
  </body>
</html>
