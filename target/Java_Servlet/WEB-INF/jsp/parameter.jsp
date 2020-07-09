<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
    <body>
        <h2>Parameter jsp !!!</h2>
        <h3>Bonjour ${reporter.pseudo} ! </h3>
        <a href="http://localhost:8080/Java_Servlet/target?pseudo=<%=request.getParameter("pseudo")%>">Redirection</a>
    </body>
</html>