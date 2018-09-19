<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
    <link rel="stylesheet"
          type="text/css"
          href="<s:url value="style.css" />">
</head>
<body>
<h1>Hello, World!</h1>
<p><s:property value="messageStore.message"/></p>
</body>
</html>
