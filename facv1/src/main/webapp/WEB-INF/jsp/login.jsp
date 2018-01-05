<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="../../jspf/general.jspf"%>
</head>
<style>
html, body, .login-box {
	height: 100%;
}
</style>
<body>
	<div class="valign-wrapper row login-box">
		<div class="col card hoverable s10 pull-s1 m6 pull-m3 l4 pull-l4">
			<form>
				<div class="card-content">
					<span class="card-title">Enter credentials</span>
					<div class="row">
						<div class="input-field col s12">
							<label for="email">Email address</label> <input type="email"
								class="validate" name="email" id="email" />
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