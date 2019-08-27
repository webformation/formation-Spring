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
                    <td><form:label path = "auteur">Auteur</form:label></td>
                    <td><form:input path = "auteur" /></td>
                </tr>
                <tr>
                    <td><form:label path = "categories">Categorie</form:label></td>
                        <td>
                        <form:checkboxes path="categories" items="${categorieList}" itemValue="categorieId" itemLabel="categorieNom" />
                    </td>
                </tr>
                <tr>
                    <td><form:label path = "langue">Langue</form:label></td>
                        <td>
                        <form:select path="langue">
                            <form:options items="${langueList}" itemValue="langueId" itemLabel="langueNom" />
                        </form:select> 
                    </td>
                </tr>
                                <tr>
                    <td><form:label path = "langue">Langue</form:label></td>
                        <td>
                        <form:radiobuttons path="langue" items="${langueList}" itemValue="langueId" itemLabel="langueNom" /> 
                    </td>
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
