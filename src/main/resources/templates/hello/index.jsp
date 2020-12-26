<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello page</title>
</head>
<body>
    <form th:action="@{/user}" th:method="get">
        <input  class="button button-block" type="submit" value="Let's enter!"/>
    </form>
    <div>
        <th:block th:each="msg : ${messages}">
            <h1 th:text="${msg}"></h1>
        </th:block>
    </div>
</body>
</html>