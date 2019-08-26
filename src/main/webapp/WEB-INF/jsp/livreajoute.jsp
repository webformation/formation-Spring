<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saisie livre</title>
    </head>
    <body>
        <h1>Livre ajouté</h1>
        <table>
            <tr>
                <td>Titre</td>
                <td>${titre}</td>
            </tr>
            <tr>
                <td>Auteur</td>
                <td>${auteur}</td>
            </tr>
            <tr>
                <td>Catégories</td>
                <td>
                    <c:forEach var="cat" items="${caterories}">
                        ${cat}
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td>Langue</td>
                <td>${langue}</td>
            </tr>
        </table>

    </body>
</html>
