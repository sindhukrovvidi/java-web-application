<%-- <%@ taglib prefix="c" uri="jakarta.tags.core" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
	rel="stylesheet">

<title>Add Todo Page</title>
</head>
<body>
	<div class="container">
		<h1>Enter Todo Details</h1>

		<form:form method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="date">Target Date</form:label>
				<form:input type="text" path="date" required="required" />
				<form:errors path="date" cssClass="text-warning" />
			</fieldset>
			<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
			<script
				src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
			<script type="text/javascript">
				$('#date').datepicker({
					format : 'yyyy-mm-dd'
				});
			</script>
			<form:input path="id" type="hidden"/>
			<form:input path="done" type="hidden"/>
			
			<input class="btn btn-success" type="submit">
		</form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>
