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

<title>UserRegister</title>

<!-- Stylesheets -->
<link href="/HotelManager/web/css/bootstrap.css" rel="stylesheet">
<link href="/HotelManager/web/css/animation.css" rel="stylesheet">
<link href="/HotelManager/web/css/checkbox/orange.css" rel="stylesheet">
<link href="/HotelManager/web/css/preview.css" rel="stylesheet">
<link href="/HotelManager/web/css/authenty.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/themes/smoothness/jquery-ui.css">

<!-- Font Awesome CDN -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">

<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans"
	rel="stylesheet">

</head>
<meta charset="utf-8">
<body>

	<section id="signup_wizard" class="authenty signup-wizard">
		<div class="section-content">
			<div class="wrap" style="padding-top: 100px; padding-bottom: 100px;">
				<div class="container">
					<div class="form-wrap">

						<div data-animation="fadeInUp" data-animation-delay=".6s">
							<div class="row nav-step">
								<div class="col-xs-4 active">
									<span></span>
								</div>
								<div class="col-xs-4">
									<span></span>
								</div>
								<div class="col-xs-4">
									<span></span>
								</div>
							</div>
							<div class="row nav-step-label">
								<div class="col-xs-4">基础信息</div>
								<div class="col-xs-4">账户信息</div>
								<div class="col-xs-4">确认</div>
							</div>
						</div>
						<form id="userRegister" method="post" action="userRegister">
						<div data-animation="bounceInLeft" data-animation-delay=".2s">
							<div class="row">
								<ul class="page-container">
									<li class="current">
										
											<div class="form-group">
												<input type="text" class="form-control" placeholder="RealName"
													name="userRealname" id="userRealname">
											</div>
											<div class="form-group">
												<input type="email" class="form-control" placeholder="userEmail"
													name="userEmail" id="userEmail">
											</div>
											<div class="form-group">
												<input type="text" class="form-control" placeholder="userPhone"
													name="userPhone" id="userPhone">
											</div>
										
									</li>
									<li>
										
											<div class="form-group">
												<input type="text" class="form-control"
													placeholder="Username" name="userName" id="userName">
											</div>
											<div class="form-group">
												<input type="password" class="form-control"
													placeholder="Password" name="userPassword">
											</div>
											<div class="form-group">
												<input type="password" class="form-control"
													placeholder="Confirm Password">
											</div>
										
									</li>
								</ul>
							</div>

							<div class="page-footer">
								<div class="row step-wrap">
									<div class="col-xs-12">
										<span><span id="stepNo"></span> of 2</span>
									</div>
								</div>
								<div class="row btn-wrap">
									<div class="col-xs-6" id="prev">
										<button class="btn btn-block nav-step-btn">上一步</button>
									</div>
									<div class="col-xs-6" id="next">
										<button onclick="Next()" class="btn btn-block nav-step-btn">下一步</button>
									</div>
									<div class="col-xs-6" id="submit">
										<button class="btn btn-block nav-step-btn" type="submit">注册</button>
									</div>
								</div>
							</div>

						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>



	<!-- js library -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/jquery-ui.min.js"></script>
	<script src="/HotelManager/web/js/bootstrap.min.js"></script>
	<script src="/HotelManager/web/js/jquery.icheck.min.js"></script>
	<script src="/HotelManager/web/js/waypoints.min.js"></script>

	<!-- authenty js -->
	<script src="/HotelManager/web/js/authenty.js"></script>

	<!-- preview scripts -->
	<script src="/HotelManager/web/js/preview/jquery.malihu.PageScroll2id.js"></script>
	<script src="/HotelManager/web/js/preview/jquery.address-1.6.min.js"></script>
	<script src="/HotelManager/web/js/preview/scrollTo.min.js"></script>
	<script src="/HotelManager/web/js/preview/init.js"></script>


	<!-- preview scripts -->
	<script>
		(function($) {

			// get full window size
			$(window).on('load resize', function() {
				var w = $(window).width();
				var h = $(window).height();

				$('section').height(h);
			});

			// scrollTo plugin
			$('#signup_from_1').scrollTo({
				easing : 'easeInOutQuint',
				speed : 1500
			});
			$('#forgot_from_1').scrollTo({
				easing : 'easeInOutQuint',
				speed : 1500
			});
			$('#signup_from_2').scrollTo({
				easing : 'easeInOutQuint',
				speed : 1500
			});
			$('#forgot_from_2').scrollTo({
				easing : 'easeInOutQuint',
				speed : 1500
			});
			$('#forgot_from_3').scrollTo({
				easing : 'easeInOutQuint',
				speed : 1500
			});

			// set focus on input
			var firstInput = $('section').find(
					'input[type=text], input[type=email]').filter(
					':visible:first');

			if (firstInput != null) {
				firstInput.focus();
			}

			$('section').waypoint(
					function(direction) {
						var target = $(this).find(
								'input[type=text], input[type=email]').filter(
								':visible:first');
						target.focus();
					}, {
						offset : 300
					}).waypoint(
					function(direction) {
						var target = $(this).find(
								'input[type=text], input[type=email]').filter(
								':visible:first');
						target.focus();
					}, {
						offset : -400
					});

			// animation handler
			$('[data-animation-delay]').each(function() {
				var animationDelay = $(this).data("animation-delay");
				$(this).css({
					"-webkit-animation-delay" : animationDelay,
					"-moz-animation-delay" : animationDelay,
					"-o-animation-delay" : animationDelay,
					"-ms-animation-delay" : animationDelay,
					"animation-delay" : animationDelay
				});
			});

			$('[data-animation]').waypoint(function(direction) {
				if (direction == "down") {
					$(this).addClass("animated " + $(this).data("animation"));
				}
			}, {
				offset : '90%'
			}).waypoint(
					function(direction) {
						if (direction == "up") {
							$(this).removeClass(
									"animated " + $(this).data("animation"));
						}
					}, {
						offset : '100%'
					});

		})(jQuery);
	</script>
</body>
</html>
