<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saisie livre</title>
    </head>
    <body>
        <h1>Saisie Livre</h1>
        <form:form method = "POST" action = "ajoutLivre">
            <table>
                <tr>
                    <td><form:label path = "titre">Titre</form:label></td>
                    <td><form:input path = "titre" /></td>
                </tr>
                <tr>
                    <td colspan = "2">
                        <input type = "submit" value = "Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
