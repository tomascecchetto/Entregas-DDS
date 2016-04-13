<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="opciones">
		<p>Elija una opción:</p>
		<p><a href="<s:url action='alta'/>">Altas</a></p>
		<p><a href="<s:url action='baja'/>">Bajas</a></p>
		<p><a href="<s:url action='modificacion'/>">Modificaciones</a></p>
		<s:actionerror />
	</s:form>
</body>
</html>