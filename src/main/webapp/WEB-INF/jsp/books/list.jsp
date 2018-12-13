<%--
  Created by IntelliJ IDEA.
  User: k.kalogerakis
  Date: 10/12/2018
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Starting page</h2>

<form action="${linkTo[BooksController].add}" method="post">
    <span>enter book title : </span>
    <input type="input" name="book.title"/>
    <span>description </span>
    <input type="input" name="book.description"/>
    <button>Send</button>
</form>
<table border="1">
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>
                <a href="${linkTo[BooksController].show(book)}">
                    details
                </a>
            </td>
            <td>${book.title}</td>
            <td>${book.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

