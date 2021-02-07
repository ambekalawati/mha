<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="UTF-8">
<title>MATERNAL HEALTH AWARENESS</title>
<link rel="shortcut icon" href="images/favicon3.jpg">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<!-- <link href="https://fonts.googleapis.com/css2?family=Anton&display=swap" rel="stylesheet"> -->
<link rel="stylesheet" href="main.css">
</head>
<body class="bg-image">
	<header class="main-header">
		<div>
			<a href="index.html" class="main-header__brand">MATERNAL HEALTH AWARENESS</a>
		</div>
		<nav class="main-nav">
			<ul class="main-nav__items">
			<li class="main-nav__item"><a href="index.html">About MHA</a></li>
			<li class="main-nav__item"><a href="doctors.do">Your Doctors</a></li>
				<li class="main-nav__item"><a href="about.html">About us</a></li>
				<li class="main-nav__item"><a href="contact.html">Contact</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<div class="container h-100">
			<div class="row h-100 justify-content-center align-items-center">
				<div class="col-10 col-md-8 col-lg-6">
					<!-- Form -->
					<h2 style='color:white;'>Forgot password</h2>
					<h2>${sessionScope.msg}</h2>
					<form class="form-example" action="forgot.do" method="post">
						<!-- Input fields -->
						<div class="form-group">
							<input type="email" class="form-control" id="inputEmail"
								name="email" placeholder="Enter email">
						</div>

						<button type="submit" class="btn btn-primary btn-customized">Submit</button>
					</form>

				</div>
			</div>
		</div>
	</main>


	<footer class="main-footer">
		<div>&copy; by Kalawati 2020</div>
	</footer>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>