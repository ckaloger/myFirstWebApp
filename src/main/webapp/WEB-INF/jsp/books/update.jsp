<%--
  Created by IntelliJ IDEA.
  User: k.kalogerakis
  Date: 12/12/2018
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${linkTo[BooksController].update(book)}" method="post">
    <span>enter book title : </span>
    <input type="input"  name="book.title"/>
    <span>description </span>
    <input type="input"  name="book.description"/>
    <button>Send</button>
</form>
</body>
</html>
