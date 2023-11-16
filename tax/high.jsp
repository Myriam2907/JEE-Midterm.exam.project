<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="fiscal.tax.model.TaxReport" %>

<html>
<head>
    <title>High Page</title>
</head>
<body>
<h1>High Page</h1>
<%
    TaxReport taxReport = (TaxReport) request.getAttribute("taxReport");
    int fiscalID = taxReport.getFiscalID();
    double computedTax = fiscalID * 0.05;
%>
<p>Fiscal ID: <%= taxReport.getFiscalID() %></p>
<p>Fiscal Year: <%= taxReport.getFiscalYear() %></p>
<p>Computed Tax: <%= computedTax %></p>
</body>
</html>
