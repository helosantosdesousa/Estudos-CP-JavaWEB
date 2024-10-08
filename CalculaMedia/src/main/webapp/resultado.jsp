<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
oi mundo jsp
<h1>Média do aluno:  ${nome}</h1>
<% /*String nome = (String) request.getAttribute("nome");
						out.println(nome);*/
						%>
						
<h2>Situação: ${situacao} </h2>	
	
	<h2>Média: ${media} </h2>						

</body>
</html>