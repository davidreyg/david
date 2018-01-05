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
<body class="white">
	<h4 class="header">Mobile Collapse Button</h4>
	<div class="row">
		<div class="col s12 m4 l3">
			<p>
				When your nav bar is resized, you will see that the links on the
				right turn into a hamburger icon <i class="mdi-navigation-menu"></i>.
				Take a look at the example below to get this functionality. Add the
				entire
				<code class=" language-markup">button-collapse</code>
				line to your
				<code class=" language-markup">nav</code>
				.
			</p>
		</div>
		<div class="col s12 m8 l9">
			<nav class="deep-orange">
			<div class="nav-wrapper">
				<div class="col s12">
					<a href="#!" class="brand-logo">Logo</a> <a href="#"
						data-activates="mobile-demo" class="button-collapse"><i
						class="mdi-navigation-menu"></i></a>
					<ul class="right hide-on-med-and-down">
						<li><a href="sass.html">Sass</a></li>
						<li><a href="components.html">Components</a></li>
						<li><a href="javascript.html">Javascript</a></li>
						<li><a href="mobile.html">Mobile</a></li>
					</ul>
					<ul class="side-nav" id="mobile-demo">
						<li><a href="sass.html">Sass</a></li>
						<li><a href="components.html">Components</a></li>
						<li><a href="javascript.html">Javascript</a></li>
						<li><a href="mobile.html">Mobile</a></li>
					</ul>
				</div>
			</div>
			</nav>
		</div>
	</div>
	</div>
</body>
</html>