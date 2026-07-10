<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="model.Question" %>

<%
Question q = (Question) request.getAttribute("question");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Question</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-dark">

<div class="container mt-5">

<div class="card p-4">

<h2 class="text-center mb-4">✏️ Edit Question</h2>

<form action="UpdateQuestionServlet" method="post">

<input type="hidden" name="id" value="<%= q.getId() %>">

<div class="mb-3">
<label>Question</label>
<input type="text" class="form-control" name="question"
value="<%= q.getQuestion() %>" required>
</div>

<div class="mb-3">
<label>Topic</label>
<input type="text" class="form-control" name="topic"
value="<%= q.getTopic() %>" required>
</div>

<div class="mb-3">
<label>Difficulty</label>
<input type="text" class="form-control" name="difficulty"
value="<%= q.getDifficulty() %>" required>
</div>

<div class="mb-3">
<label>Company</label>
<input type="text" class="form-control" name="company"
value="<%= q.getCompany() %>" required>
</div>

<button class="btn btn-primary w-100">
Update Question
</button>

</form>

</div>

</div>

</body>
</html>