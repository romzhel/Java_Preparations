<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Добавление студента</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
    <div class="py-5">
        <form:form action="/students/edit-form" modelAttribute="student" method="post">
            <div class="row mb-3">
                <label for="inputEmail3" class="col-sm-2 col-form-label">Имя</label>
                <div class="col-sm-10">
                    <form:input path="name" class="form-control" id="inputEmail3"/>
                </div>
            </div>
            <div class="row mb-3">
                <label for="inputPassword3" class="col-sm-2 col-form-label">Возраст</label>
                <div class="col-sm-10">
                    <form:input path="age" class="form-control" id="inputPassword3"/>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Добавить</button>
        </form:form>
    </div>
</div>
</body>
</html>