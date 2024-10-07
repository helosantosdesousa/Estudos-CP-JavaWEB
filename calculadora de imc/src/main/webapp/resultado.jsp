<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado IMC</title>
</head>
<body>
Seu IMC é: <!-- <% 
				Double imc = (Double) request.getAttribute("imc");
				out.println(imc);

			%>  --> 
			${imc}

</body>
</html>