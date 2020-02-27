<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>WebApp Sample</title>
		<link rel="stylesheet" href="<c:url value='/static/vendors/bootstrap/css/bootstrap.min.css'/>">
		<link rel="stylesheet" href="<c:url value='/static/vendors/fontawesome/css/all.min.css'/>"/>
	</head>
	<body>
		
		<%@include file='template/navbar.jsp'%>
		
		<div class="container">
			<div class="row">
				<div class="col-8">
					<c:if test="${not empty response}">
						<div class="alert alert-danger alert-dismissible fade show" role="alert">
							<p><strong>Error: </strong><c:out value="${response}"/></p>
							<button type="button" class="close" data-dismiss="alert" aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
					</c:if>
					<div class="card">
						<div class="card-header">
							Login Form
						</div>
						<div class="card-body">
							<form action="<%=request.getContextPath()%>/user/loginuser" method="POST">
								<div class="form-group">
									<label for="username">Username</label>
								    <input type="text" name="username" class="form-control" id="username" aria-describedby="usernameHelp">
								    <small id="usernameHelp" class="form-text text-muted">We'll never share your username or password with anyone else.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label>
		    						<input type="password" name="password" class="form-control" id="exampleInputPassword1">
								</div>
								<button type="submit" class="btn btn-primary btn-block">Login</button>
								<small>Don't have an account yet? <a href="/<%=request.getContextPath() %>/user/registerpage">Click here</a> to register!</small>
							</form>
						</div>
					</div>
				</div>
				<div class="col-4">
					<img class="img-fluid" alt="Charmander!" src="<c:url value='/static/pictures/charmander.gif' />">
				</div>
			</div>
		</div>
		
		
		<script type="text/javascript" src="<c:url value='/static/js/jquery-3.4.1.slim.min.js' />"></script>
		<script type="text/javascript" src="<c:url value='/static/js/popper.min.js' />" ></script>
		<script type="text/javascript" src="<c:url value='/static/vendors/fontawesome/js/all.min.js' />" ></script>
	</body>
</html>