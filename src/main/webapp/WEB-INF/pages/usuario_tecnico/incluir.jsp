<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" href="../css/material-icons.css" />
    <link rel="stylesheet" href="../materialize/css/materialize.css" />
    <link rel="stylesheet" href="../css/homepage.css" />

    <script type="text/javascript" src="../js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="../materialize/js/materialize.js"></script>

    <title>Helpdesk - UsuarioTecnico - Incluir</title>
</head>

<body style="background: none;">

    <jsp:include page="../menu.jsp" />
	
    <section id="body-content">

        <div class="row">
            <div class="col s12">

				<form:form modelAttribute="usuario_tecnico" method="POST" action="salvar">
				
					<div class="row">
					
				      	<div class="input-field col s12">
				      		<form:input path="nome" id="nomeUsuarioTecnico" type="text"/>
				      		<label for="nomeUsuarioTecnico">Nome</label>
						</div>
						
				      	<div class="input-field col s12">
				      		<form:input path="email" id="emailUsuarioTecnico" type="text"/>
				      		<label for="emailUsuarioTecnico">E-mail</label>
						</div>
						
				      	<div class="input-field col s12">
				      		<form:input path="nivel" id="nivelUsuarioTecnico" type="number"/>
				      		<label for="nivelUsuarioTecnico">Nível</label>
						</div>
					
					</div>

					<div class="row">
						<div class="input-field col s12">
							<form:button class="btn blue-effect blue darken-2 col s12" type="submit" value="Abrir UsuarioTecnico">Incluir Usuario Técnico</form:button>
						</div>
					</div>				
				
				</form:form>

            </div>
        </div>

    </section>

	<jsp:include page="../scripts.jsp" />

</body>

</html>