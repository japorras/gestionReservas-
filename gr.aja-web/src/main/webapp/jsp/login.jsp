<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Usuario</title>
<script type="text/javascript" src="/gr.aja-web/resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="/gr.aja-web/resources/js/jquery.showPassword.js"></script>
<link href="/gr.aja-web/resources/css/screen.css" rel="stylesheet" media="screen,projection" />
<style>
.forms li {
  position: relative;
}
.show-password-link {
  display: block;
  position: absolute;
  z-index: 11;
}
.password-showing {
  position: absolute;
  z-index: 10;
}
</style>

</head>

<body>
  	<c:if test="${not empty error}">
  		<div class="errorblock">
  			Login error: Por favor, intentelo nuevamente <br/>Causa:
  			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
  		</div>
  	</c:if>
  	
    <form class="formLogin" action="<c:url value='../../j_spring_security_check' />" method="POST" onsubmit="forceHttpsOnSubmit(this)">	
    <ol class="forms">
      <li>
        <label for="username">Usuario</label>
        <input type="text" name="j_username" id="j_username" />
      </li>
      <li>
        <label for="password">Password</label>
        <input type="password" name="j_password" id="j_password" class="password" />
      </li>
      <li class="buttons">
        <button id="boton">Enviar</button>
      </li>
    </ol>
    </form>
  
  

<script type="text/javascript">
$(document).ready(function() {
  $(':password').showPassword({
    linkRightOffset: 5,
    linkTopOffset: 11
  });
  

});

function forceHttpsOnSubmit(objForm) {
    objForm.action = objForm.action.replace("http:", "https:").replace("localhost:8080","localhost:8443");
}

</script>
</body>
</html>
