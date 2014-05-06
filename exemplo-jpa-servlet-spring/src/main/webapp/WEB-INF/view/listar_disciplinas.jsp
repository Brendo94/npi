<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap-combined.min.css" />" rel="stylesheet"/>
<link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet"/>
<script src="<c:url value="/resources/js/jquery.dataTables.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-latest.min.js"/>"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Disciplinas</title>
</head>
<body>
	<h1>Listagem de Disciplinas</h1>
	<datatables:table id="vets" data="${disciplinas}" cdn="true" row="disciplina" theme="bootstrap2" cssClass="table table-striped">
	    <datatables:column title="Nome">
	        <c:out value="${disciplina.nome}"></c:out>
	    </datatables:column>
	    <datatables:column title="Codigo">
	        <c:out value="${disciplina.cod_d}"></c:out>
	    </datatables:column>
	</datatables:table>
</body>
</html>