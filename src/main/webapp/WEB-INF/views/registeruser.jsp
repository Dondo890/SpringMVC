<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				<div class="col-2"></div>
				<div class="col-8">
					<div class="card">
						<div class="card-header">
							Registration form
						</div>
						<div class="card-body">
							<form:form method="POST" action="registeruser" modelAttribute="userDto">
								<div class="form-row">
									<div class="form-group col-6">
										<label for="usernameInput">Username</label><sup class="far fa-question-circle" data-toggle="tooltip" data-placement="top"
											title="Username must contain atleast 1 uppercase and a number"></sup>
										<form:input path="username" name="username" type="text" id="usernameInput" class="form-control"/>
									</div>
									<div class="form-group col-6">
										<label for="passwordInput">Password</label><sup class="far fa-question-circle" data-toggle="tooltip" data-placement="top"
											title="Password must contain atleast 1 uppercase, 1 special character, 1 number and must be alphanumeric."></sup>
										<form:input path="password" name="password" type="password" id="passwordInput" class="form-control"/>
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-8">
										<label for="addressInput">Address</label>
										<form:input path="address" name="address" type="text" id="addressInput" class="form-control"/>
									</div>
									<div class="form-group col-4">
										<label for="sellerInput">User Type</label>
										<form:select path="seller" name="seller" id="sellerInput" class="form-control">
											<option value="true">Seller</option>
											<option value="false">Buyer</option>
										</form:select>
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-4">
										<label for="firstnameInput">First Name</label>
										<form:input path="firstName" name="firstName" type="text" id="firstnameInput" class="form-control"/>
									</div>
									<div class="form-group col-4">
										<label for="lastnameInput">Last Name</label>
										<form:input path="lastName" name="lastName" type="text" id="lastnameInput" class="form-control"/>
									</div>
									<div class="form-group col-4">
										<label for="ageInput">Age</label>
										<form:input path="age" name="age" type="number" id="ageInput" class="form-control"/>
									</div>
								</div>
								<button class="btn btn-primary btn-block" type="submit">Register</button>
							</form:form>
						</div>
					</div>
				</div>
				<div class="col-2"></div>
			</div>
		</div>
	
	
		<script type="text/javascript" src="<c:url value='/static/js/jquery-3.4.1.min.js' />" ></script>
		<script type="text/javascript" src="<c:url value='/static/js/jquery-3.4.1.slim.min.js' />"></script>
		<script type="text/javascript" src="<c:url value='/static/js/popper.min.js' />" ></script>
		<script type="text/javascript" src="<c:url value='/static/vendors/fontawesome/js/all.min.js' />" ></script>
	</body>
</html>