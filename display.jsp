<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Display operations</title>
<style type="text/css">
<%@include file="css/style.css" %>
</style>
</head>
<body>
<div align="left">
<a href="add.jsp" style="color:white">Add New Account</a>
	</div>
<div id="main-holder">
<table border="1">
<thead>
      <tr>
  <th>Name</th>
  <th>MobileNo</th>
  <th>AadharId</th>
  <th>EmailId</th>
   </tr>
   </thead>
  <tbody>
  <c:forEach var="user" items="${AccountList}">
  <tr>
  <td><c:out value="${user.name }" /></td>
  <td><c:out value="${user.mobileno}" /></td>
  <td><c:out value="${user.aadharid }" /></td>
  <td><c:out value="${user.emailid }" /></td>
  <td><a href="edit.jsp">Edit Account</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="remove.jsp">Delete Account</a></td>
  </tr>
  </c:forEach>
  </tbody>
</table>
</div>	
<div align=="right"><a href="index.jsp" style="color:white">logout</a></div>
</body>
</html>