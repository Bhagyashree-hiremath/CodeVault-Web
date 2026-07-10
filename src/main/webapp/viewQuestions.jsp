<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="model.Question"%>

<%
List<Question> list = (List<Question>) request.getAttribute("questions");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Questions</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background:#0D1117;
    color:white;
}

.card{
    background:#161B22;
    border-radius:15px;
}

table{
    border-radius:10px;
    overflow:hidden;
}

h2{
    color:#58A6FF;
}
</style>

</head>

<body>

<div class="container mt-5">

<div class="card p-4">

<h2 class="text-center mb-4">📚 All Interview Questions</h2>

<table class="table table-dark table-hover table-bordered">

<thead>

<tr>

<th>ID</th>
<th>Question</th>
<th>Topic</th>
<th>Difficulty</th>
<th>Company</th>
<th>Action</th>

</tr>

</thead>

<tbody>

<%
if(list != null){

for(Question q : list){
%>

<tr>

<td><%= q.getId() %></td>

<td><%= q.getQuestion() %></td>

<td><%= q.getTopic() %></td>

<td><%= q.getDifficulty() %></td>

<td><%= q.getCompany() %></td>

<td>

<a href="EditQuestionServlet?id=<%= q.getId() %>"
class="btn btn-warning btn-sm">
✏️ Edit
</a>

<a href="DeleteQuestionServlet?id=<%= q.getId() %>"
class="btn btn-danger btn-sm"
onclick="return confirm('Are you sure you want to delete this question?')">
🗑 Delete
</a>

</td>

</tr>

<%
}

}else{
%>

<tr>

<td colspan="6" class="text-center">
No Questions Found
</td>

</tr>

<%
}
%>

</tbody>

</table>

<div class="text-center mt-3">

<a href="dashboard.jsp" class="btn btn-primary">
🏠 Back to Dashboard
</a>

</div>

</div>

</div>

</body>
</html>