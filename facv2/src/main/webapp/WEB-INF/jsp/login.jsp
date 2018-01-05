<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="<c:url value='/resources/css/page-center.css" type="text/css'/>"
	rel="stylesheet" media="screen,projection">
<%@include file="../../jspf/general.jspf"%>
</head>
<style>
html, body, .login-box {
	height: 100%;
}
</style>
<body class="white">
	<div class="valign-wrapper row login-box">
		<div class="col card hoverable s10 pull-s1 m6 pull-m3 l4 pull-l4">
			<form action="login" method="POST">
				<div class="card-content">
					<span class="card-title">Enter credentials</span>
					<div class="row">
						<div class="input-field col s12">
							<label for="user">Email address</label> <input type="text"
								class="validate" name="user" id="user" />
						</div>
						<div class="input-field col s12">
							<label for="password">Password </label> <input type="password"
								class="validate" name="password" id="password" />
						</div>
					</div>
				</div>
				<div class="card-action right-align">
					<input type="reset" id="reset"
						class="btn-flat grey-text waves-effect"> <input
						type="submit" class="btn green waves-effect waves-light"
						value="Login">
				</div>
			</form>
		</div>
	</div>
</body>
</html>