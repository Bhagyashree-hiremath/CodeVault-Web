<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Add Question</title>
<link rel="stylesheet" href="css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#0D1117;
color:white;
}

.card{

background:#161B22;
border:none;
border-radius:20px;

}

.btn-success{

background:#238636;
border:none;

}

.btn-success:hover{

background:#2ea043;

}

</style>

</head>

<body>

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-8">

<div class="card p-5">

<h2 class="text-center text-info mb-4">

➕ Add Interview Question

</h2>

<form action="AddQuestionServlet" method="post">

<div class="mb-3">

<label>Question</label>

<textarea
class="form-control"
rows="4"
name="question"
required>

</textarea>

</div>

<div class="mb-3">

<label>Topic</label>

<input
type="text"
class="form-control"
name="topic"
required>

</div>

<div class="mb-3">

<label>Difficulty</label>

<select
class="form-control"
name="difficulty">

<option>Easy</option>

<option>Medium</option>

<option>Hard</option>

</select>

</div>

<div class="mb-3">

<label>Company</label>

<input
type="text"
class="form-control"
name="company"
required>

</div>

<button
class="btn btn-success w-100">

Save Question

</button>

</form>

</div>

</div>

</div>

</div>

</body>
</html>