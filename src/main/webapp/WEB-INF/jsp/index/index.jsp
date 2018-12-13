<!doctype html>
<html>
<body>
<h2>Hello World!</h2>
<form action="${linkTo[BooksController].list}" method="get">
    <span>enter username : </span>
    <input type="input" name="mymail.username"/>
    <span>password </span>
    <input type="input" name="mymail.password"/>
    <span>mailto : </span>
    <input type="input" name="mymail.mailTo"/>
    <span>message </span>
    <input type="input" name="mymail.message"/>
    <button>Send</button>
</form>
</body>
</html>
