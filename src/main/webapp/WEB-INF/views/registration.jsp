

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Registration Form</title>

        <style>
            .error {
                color: #ff0000;
            }
        </style>
    </head>
    <body>
        <h2>Registration Form</h2>
        <form:form method="POST" modelAttribute="employee">
            <form:input type="hidden" path="id" id="id"/>
            <table>
                <tr>
                    <td><label for="name">Name: </label> </td>
                    <td><form:input path="name" id="name"/></td>
                    <td><form:errors path="name" cssClass="error"/></td>
                </tr>

                <tr>
                    <td><label for="joiningDate">Joining Date: </label> </td>
                    <td><form:input path="joiningDate" id="joiningDate"/></td>
                    <td><form:errors path="joiningDate" cssClass="error"/></td>
                </tr>

                <tr>
                    <td><label for="salary">Salary: </label> </td>
                    <td><form:input path="salary" id="salary"/></td>
                    <td><form:errors path="salary" cssClass="error"/></td>
                </tr>

                <tr>
                    <td><label for="ssn">SSN: </label> </td>
                    <td><form:input path="ssn" id="ssn"/></td>
                    <td><form:errors path="ssn" cssClass="error"/></td>
                </tr>

                <tr>
                    <td colspan="3">
                        <c:choose>
                            <c:when test="${edit}">
                                <input type="submit" value="Update"/>
                            </c:when>
                            <c:otherwise>
                                <input type="submit" value="Register"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </table>
        </form:form>
        <br/>
        <br/>
        Go back to <a href="<c:url value='/list' />">List of All Employees</a>

        <h2>Registration Form Colaborador</h2>
        <form:form method="POST" action="new2" modelAttribute="colaborador">
            <form:input type="hidden" path="id" id="id"/>
            <table>
                <tr>
                    <td><label for="nombre">Nombre: </label> </td>
                    <td><form:input path="nombre" id="nombre"/></td>
                    <td><form:errors path="nombre" cssClass="error"/></td>
                </tr>

                <tr>
                    <td colspan="3">
                        <c:choose>
                            <c:when test="${edit2}">
                                <input type="submit" value="Update"/>
                            </c:when>
                            <c:otherwise>
                                <input type="submit" value="Register"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </table>
        </form:form>
        <br/>
        <br/>
        Go back to <a href="<c:url value='/list' />">List of All Colaboradores</a>
    
</body>
</html>
