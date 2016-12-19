<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login, registration forms">
    <meta name="author" content="Seong Lee">

    <title>登录</title>

    <!-- Stylesheets -->
    <link href="../css/bootstrap.css" rel="stylesheet">
	<link href="../css/animation.css" rel="stylesheet">
	<link href="../css/checkbox/orange.css" rel="stylesheet">
	<link href="../css/preview.css" rel="stylesheet">
	<link href="../css/authenty.css" rel="stylesheet">
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/smoothness/jquery-ui.css">

	<!-- Font Awesome CDN -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
	
	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
			<section id="signin_alt" class="authenty signin-alt">
				<div class="section-content">
				  <div class="wrap" style="padding-top: 100px;">
					  <div class="container">
							<div class="row" data-animation="fadeInUp">
							  <div class="col-md-4 col-md-offset-1">
									<div class="normal-signin"> 
										<div class="title">
											<h3>Sign In</h3>
										</div> 
									  <form id="loginForm" method="post" action="action.admin.loginAction">
									  <div class="form-main">
										  <div class="form-group">
												<div class="un-wrap">
													<i class="fa fa-user"></i>
											  	<input type="text" class="form-control" placeholder="Username" required="required">
												</div>
												<div class="pw-wrap">
													<i class="fa fa-lock"></i>
											  	<input type="password" class="form-control" placeholder="Password" required="required">
												</div>
												<div class="row">
													<div class="col-md-6">
														<input type="checkbox" class="form-control" checked>
														<label>Remember me</label>
													</div>
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
										<a href="#" class="facebook"><i class="fa fa-facebook"></i><span>Sign in with Phone</span></a>
										<a href="#" class="google-plus"><i class="fa fa-google-plus"></i><span>Sign in with Email</span></a>
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
							</div>
						</div>
					</div>
				</div>
			</section>
			<!-- js library -->
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/jquery-ui.min.js"></script>
    	<script src="../js/bootstrap.min.js"></script>
		<script src="../js/jquery.icheck.min.js"></script>
		<script src="../js/waypoints.min.js"></script>
		
		<!-- authenty js -->
		<script src="js/authenty.js"></script>
		
		<!-- preview scripts -->
		<script src="../js/preview/jquery.malihu.PageScroll2id.js"></script>
		<script src="../js/preview/jquery.address-1.6.min.js"></script>
		<script src="../js/preview/scrollTo.min.js"></script>
		<script src="../js/preview/init.js"></script>
		
		
		<!-- preview scripts -->
		<script>
			(function($) {
				
				// get full window size
				$(window).on('load resize', function(){
				    var w = $(window).width();
				    var h = $(window).height();

				    $('section').height(h);
				});		

				// scrollTo plugin
				$('#signup_from_1').scrollTo({ easing: 'easeInOutQuint', speed: 1500 });
				$('#forgot_from_1').scrollTo({ easing: 'easeInOutQuint', speed: 1500 });
				$('#signup_from_2').scrollTo({ easing: 'easeInOutQuint', speed: 1500 });
				$('#forgot_from_2').scrollTo({ easing: 'easeInOutQuint', speed: 1500 });
				$('#forgot_from_3').scrollTo({ easing: 'easeInOutQuint', speed: 1500 });
				
				
				// set focus on input
				var firstInput = $('section').find('input[type=text], input[type=email]').filter(':visible:first');
        
				if (firstInput != null) {
            firstInput.focus();
        }
				
				$('section').waypoint(function (direction) {
					var target = $(this).find('input[type=text], input[type=email]').filter(':visible:first');
					target.focus();
				}, {
	          offset: 300
	      }).waypoint(function (direction) {
					var target = $(this).find('input[type=text], input[type=email]').filter(':visible:first');
			  	target.focus();
	      }, {
	          offset: -400
	      });
				
				
				// animation handler
				$('[data-animation-delay]').each(function () {
	          var animationDelay = $(this).data("animation-delay");
	          $(this).css({
	              "-webkit-animation-delay": animationDelay,
	              "-moz-animation-delay": animationDelay,
	              "-o-animation-delay": animationDelay,
	              "-ms-animation-delay": animationDelay,
	              "animation-delay": animationDelay
	          });
	      });
				
	      $('[data-animation]').waypoint(function (direction) {
	          if (direction == "down") {
	              $(this).addClass("animated " + $(this).data("animation"));
	          }
	      }, {
	          offset: '90%'
	      }).waypoint(function (direction) {
	          if (direction == "up") {
	              $(this).removeClass("animated " + $(this).data("animation"));
	          }
	      }, {
	          offset: '100%'
	      });
			
			})(jQuery);
		</script>
  </body>
</html>
