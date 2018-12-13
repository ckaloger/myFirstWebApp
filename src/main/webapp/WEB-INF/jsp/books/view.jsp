<%--
  Created by IntelliJ IDEA.
  User: k.kalogerakis
  Date: 10/12/2018
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width:100%">
    <tr>
        <th>${book.title}</th>
        <th>${book.description}</th>
        <th><a href="${linkTo[BooksController].updateScreen(book)}">
            update
        </a></th>
        <th><a href="${linkTo[BooksController].remove(book)}">
            delete
        </a></th>
    </tr>
</table>
</body>
</html>
