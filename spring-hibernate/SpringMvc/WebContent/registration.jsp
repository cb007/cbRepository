<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Form tag library used to bind form fields to entity object -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To The Registration Page</title>
<link type="text/css" rel="stylesheet" href="styles/reg.css">
</head>
<body>
	<section>
		<!--  name of the form, method, url to be called and the entity object to be mapped with form -->
		<form:form name="RegForm" method="POST"
			action="customerRegistration.htm" commandName="customer">
			<fieldset>
				<legend>Customer Form</legend>
				<form:errors path="customerId" class="errors"></form:errors>
				<form:errors path="name" class="errors"></form:errors>
				<form:errors path="dob" class="errors"></form:errors>
				<form:errors path="address" class="errors"></form:errors>
				<form:errors path="phoneNo" class="errors"></form:errors>
				<form:errors path="email" class="errors"></form:errors>
				<!-- path attribute is used to map form fields with entity object- we need to specify entity variables -->
				<form:input type="text" path="customerId" placeholder="Customer Id"></form:input>
				<form:input type="text" path="name" placeholder="Name"></form:input>
				<form:input type="date" path="dob" placeholder="Date of Birth"></form:input>
				<form:input type="text" path="address" placeholder="Address"></form:input>
				<form:input type="tel" path="phoneNo" placeholder="Mobile"></form:input>
				<form:input type="email" path="email" placeholder="Email"></form:input>
				<form:select path="stateCode">
				<!-- item label is the one which will be visible in dropdown and item value will be sent to controller(in this case state code -->
				<form:options itemLabel="name" itemValue="code" items="${stateList}"/>
				</form:select>
				<form:input path="" type="submit" value="Register"></form:input>
			</fieldset>
		</form:form>
	</section>

</body>
</html>