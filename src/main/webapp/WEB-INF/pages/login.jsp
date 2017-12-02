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

    <link rel="stylesheet" href="css/material-icons.css" />
    <link rel="stylesheet" href="materialize/css/materialize.css" />
    <link rel="stylesheet" href="css/login.css" />

    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="materialize/js/materialize.js"></script>

    <title>Login</title>
</head>

<body>

	<form:form class="login-form" method="POST" action="login" modelAttribute="usuario">
	    <div class="card horizontal">
	        
	        <div class="card-image hide-on-med-and-down"></div>
	        
	        <div class="row">
	            <div class="col s12">
	                <div class="card-content">
	                    <br />
	                    
	                    <img class="img-logo" src="images/helpdesk.png" alt="Helpdesk" />
	                    
	                    <div class="input-field col s12">
	                        <i class="material-icons prefix">account_circle</i>
	                        <form:input path="id" required="required" type="text" />
	                        <label for="user-input">Usuário</label>
	                    </div>
	                    
	                    <div class="input-field col s12">
	                        <i class="material-icons prefix">https</i>
	                        <form:input path="senha" required="required" type="password" />
	                        <label for="password-input">Senha</label>
	                    </div>
	                    
	                    <div class="col s12">
	                        <form:button class="btn blue-effect blue darken-2 col s12" type="submit" value="login">Entrar</form:button>
	                    </div>
	                    
	                    <div class="row"></div>
	                    
	                    <div class="row center">
	                        <span class="activator blue-text" style="cursor: pointer;">Esqueci minha senha.</span>
	                    </div>
	                    
						<c:if test="${erro != null}">
							<div class="card-panel red lighten-4 red-text text-darken-4"><b>Erro!</b> ${erro}</div>
						</c:if>	                    
	                    
	                </div>
	            </div>
	        </div>
	
	        <div class="card-reveal" style="padding: 0">
	            <div class="row">
	                <span class="card-title grey-text text-darken-4">
	                    <i class="material-icons right" style="padding: 10px">clear</i>
	                </span>
	            </div>
	            <div class="row">
	                <div class="col s12 l6 hide-on-med-and-down">.</div>
	                <div class="col s12 l6">
	                    <div class="row">
	                        <div class="col s12">
	                            <div class="row center">
	                                <i class="material-icons yellow-text text-darken-3 large">warning</i>
	                                <h4>Recuperação de senha</h4>
	                            </div>
	                            <div class="row center">
	                                <div class="input-field col s12">
	                                    <i class="material-icons prefix">account_circle</i>
	                                    <input type="text" name="forget-password-input" id="forget-password-input" />
	                                    <label for="forget-password-input">Informe sua matricula ou seu e-mail</label>
	                                </div>
	                            </div>
	                            <div class="row center">
	                                <div class="col s12">
	                                    <a class="btn waves-effect waves-light blue darken-2" style="width: 100%;">Solicitar</a>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	        
	    </div>
	</form:form>
	
</body>

</html>