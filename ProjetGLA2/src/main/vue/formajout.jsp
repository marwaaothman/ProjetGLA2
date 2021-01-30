<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boutique</title>
</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Bibliotheque/a>
			</div>
			
	<div class="container">

		<div class="row" style="margin-top: 80px;">

					<div class="col-md-9">

				<div class="panel panel-info">
					<div class="panel-heading">Ajouter un livre</div>
					<div class="panel-body">

						<form:form action="save" method="post" modelAttribute="l">

							
							<p>
								Titre:
								<form:input path="titre" />
							</p>
							<p>
								Quantite:
								<form:input path="quantite" />
							</p>
							

							<input class="btn btn-primary" type="submit" value="enregistrer">
						</form:form>



					</div>

				</div>


			</div>

		</div>
	</div>


</body>
</html>