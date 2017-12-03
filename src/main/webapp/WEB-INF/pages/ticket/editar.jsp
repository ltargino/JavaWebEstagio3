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

    <link rel="stylesheet" href="../../css/material-icons.css" />
    <link rel="stylesheet" href="../../materialize/css/materialize.css" />
    <link rel="stylesheet" href="../../css/homepage.css" />

    <script type="text/javascript" src="../../js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="../../materialize/js/materialize.js"></script>

    <title>Helpdesk - Ticket - Alterar</title>
</head>

<body style="background: none;">

    <jsp:include page="../menu.jsp" />
	
    <section id="body-content">

        <div class="row">
            <div class="col s12">

				<form:form modelAttribute="ticket" method="POST" action="../salvar">
				
					<div class="row">

				      	<div class="input-field col s12">
				      		<form:input readonly="true" path="id" id="idTicket" type="text" value="${ticket.id}"/>
				      		<label for="idTicket">ID</label>
						</div>
					
				      	<div class="input-field col s12">
				      		<form:input path="titulo" id="tituloTicket" type="text"/>
				      		<label for="tituloTicket">Título</label>
						</div>
						
				      	<div class="input-field col s12">
				      		<form:input path="descricao" id="descricaoTicket" type="text"/>
				      		<label for="descricaoTicket">Descrição</label>
						</div>												
					
						<div class="input-field col s12">
						    <form:select id="prioridadeTicket" items="${prioridade}" path="prioridade"/>
						    <label>Prioridade</label>
						</div>					

						<div class="input-field col s12">
						    <form:select id="statusTicket" items="${status}" path="status"/>
						    <label>Status</label>
						</div>					
					
					</div>

					<div class="row">
						<div class="input-field col s12">
							<form:button class="btn blue-effect blue darken-2 col s12" type="submit" value="Abrir Ticket">Salvar Ticket</form:button>
						</div>
					</div>				
				
				</form:form>

            </div>
        </div>

    </section>

	<jsp:include page="../scripts.jsp" />

</body>

</html>