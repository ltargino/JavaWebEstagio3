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
    <link rel="stylesheet" href="../css/tickets.css" />

    <script type="text/javascript" src="../js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="../materialize/js/materialize.js"></script>

    <title>Helpdesk - Homepage</title>
</head>

<body style="background: none;">

    <jsp:include page="../menu.jsp" />
	
    <section id="body-content">

        <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
            <a class="btn-floating btn-large blue darken-2 tooltipped" data-position="left" data-tooltip="Abrir Ticket" href="../ticket/incluir">
                <i class="material-icons">add</i>
            </a>
        </div>

        <div class="row">
            <div class="col s10 offset-s1">

                <table class="striped highlight">

                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Título</th>
                            <th>Descrição</th>
                            <th>Prioridade</th>
                            <th>Status</th>
                            <th>Usuário</th>
                            <th>Ações</th>
                        </tr>
                    </thead>

                    <tbody>
						<c:forEach var="ticket" items="${tickets}">
							<tr>
								<td>${ticket.id}</td>
								<td>${ticket.titulo}</td>
								<td>${ticket.descricao}</td>
								<td>${ticket.prioridade}</td>
								<td>${ticket.status}</td>
								<td>${ticket.usuario.nome}</td>
								<td>
									<a href="editar/${ticket.id}" class="btn waves-effect waves-light blue">Editar</a>
									<a href="deletar/${ticket.id}" onclick="return confirm('Confirma deletar o item de Nº ${ticket.id}?');" class="btn waves-effect waves-light red btndelete">Deletar</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>

                </table>
            
            </div>
        </div>

    </section>

	<jsp:include page="../confirm.jsp" />
	<jsp:include page="../scripts.jsp" />

</body>

</html>