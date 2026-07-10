<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="model.Question" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>View Questions</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-dark text-white">

<div class="container mt-5">

<h2 class="text-info mb-4">
📚 All Interview Questions
</h2>

<table class="table table-dark table-bordered table-hover">

<tr>

<th>ID</th>
<th>Question</th>
<th>Topic</th>
<th>Difficulty</th>
<th>Company</th>
<th>Action</th>

</tr>

<%

List<Question> list = (List<Question>)request.getAttribute("questions");

for(Question q : list){

%>

<tr>

<td><%= q.getId() %></td>

<td><%= q.getQuestion() %></td>

<td><%= q.getTopic() %></td>

<td><%= q.getDifficulty() %></td>

<td><%= q.getCompany() %></td>
<td>
    <a href="DeleteQuestionServlet?id=<%= q.getId() %>"
       class="btn btn-danger btn-sm"
       onclick="return confirm('Are you sure you want to delete this question?');">
        Delete
    </a>
</td>

</tr>

<%

}

%>

</table>

</div>

</body>

</html>