<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><a href="<s:url action='alta'/>">Ir a altas</a></p>
	<p><a href="<s:url action='baja'/>">Ir a bajas</a></p>
	<p><s:form action="modify">
        <s:textfield label="Nombre" name="name"></s:textfield>
        <s:textfield label="Edad" name="age"></s:textfield>
        <s:radio label="Genero" name="gender" list="#{'Femenino':'Femenino','Masculino':'Masculino'}" />
        <s:submit></s:submit>
        <table>
        <tr>
            <th>ID</th>
            <th>NOMBRE</th>
            <th>EDAD</th>
            <th>GENERO</th>
        </tr>
    <s:iterator value="personas">
        <tr>
            <td><s:property value="getID()"/></td>
            <td><s:property value="getName()"/></td>
            <td><s:property value="getAge()"/></td>
            <td><s:property value="getGender()"/></td>
        </tr>
    </s:iterator>
    </table>    
        <s:actionerror/>
	</s:form></p>
</body>
</html>