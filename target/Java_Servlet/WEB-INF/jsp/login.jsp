<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
    <body>
        <h2>Bonjour</h2>
        <form method="post">
            <label for="pseudo">Nom : </label>
            <input type="text" name="pseudo" id="pseudo" />
            <label for="mdp">Mot de passe : </label>
            <input type="text" name="mdp" id="mdp" />
            <input type="submit" />
        </form>
    </body>
</html>