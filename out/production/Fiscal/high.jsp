<%@ page import="Model.TaxReport" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>High Page</title>
</head>
<body>
<h1>High Page</h1>

<%
    TaxReport taxReport = (TaxReport) request.getAttribute("taxReport");
%>

<p>Fiscal ID: <%= taxReport.getFiscalID() %></p>
<p>Fiscal Year: <%= taxReport.getFiscalYear() %></p>
</body>
</html>
