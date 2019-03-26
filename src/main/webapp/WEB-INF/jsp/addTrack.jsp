<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 24.03.2019
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding track</title>
</head>
<body>
<form:form method="post" modelAttribute="track" action="/addTrack">
    <table>
        <tr>
            <th colspan="2">Add Track</th>
        </tr>
        <tr>
            <form:hidden path="id" />
            <td><form:label path="name">Track Name:</form:label></td>
            <td><form:input path="name" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="album">Album:</form:label></td>
            <td><form:input path="album" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="duration">Duration:</form:label></td>
            <td><form:input path="duration" size="30" maxlength="30"></form:input></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   class="blue-button" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
