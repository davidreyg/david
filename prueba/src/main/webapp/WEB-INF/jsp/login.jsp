<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="../../jspf/general.jspf"%>
</head>
<body class="white">
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-lg-4 col-md-offset-4">
				<h1 class="text-center login-title">Sign in to continue to
					Bootsnipp</h1>
				<div class="account-wall">
					<img class="profile-img"
						src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
						alt="">
					<form class="form-signin" action="login" method="POST">
						<input type="text" name="username" class="form-control"
							placeholder="Email" required autofocus> <input
							type="password" name="password" class="form-control"
							placeholder="Password" required>
						<button type="submit" class="btn btn-lg btn-primary btn-block">Ingresar</button>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" /> <span
							class="clearfix"></span>


						<div class="input-field col s12">
							<c:if test="${not empty error}">
								<div class="alert alert-danger alert-dismissible" role="alert">
									<button type="button" class="close" data-dismiss="alert"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<strong>Upss! </strong>${error}
								</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="alert alert-success alert-dismissible" role="alert">
									<button type="button" class="close" data-dismiss="alert"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<strong>Bien! </strong>${msg}
								</div>
							</c:if>
						</div>
					</form>
				</div>
<!-- 				<a href="#" class="text-center new-account">Create an account </a> -->
			</div>
		</div>
	</div>
</body>
</html>