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
<title>Search Questions</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#0D1117;
    color:white;
}

.card{
    background:#161B22;
    border-radius:15px;
    padding:25px;
}

h2{
    color:#58A6FF;
}

</style>

</head>

<body>

<div class="container mt-5">

<div class="card">

<h2 class="text-center mb-4">🔍 Search Questions</h2>

<form action="SearchQuestionServlet" method="get">

<div class="row">

<div class="col-md-10">
<input type="text"
class="form-control"
name="topic"
placeholder="Enter Topic (Java, SQL, DSA...)"
required>
</div>

<div class="col-md-2">
<button class="btn btn-primary w-100">
Search
</button>
</div>

</div>

</form>

<hr>

<table class="table table-dark table-hover mt-4">

<thead>

<tr>

<th>ID</th>
<th>Question</th>
<th>Topic</th>
<th>Difficulty</th>
<th>Company</th>

</tr>

</thead>

<tbody>

<%
if(list != null && !list.isEmpty()){

for(Question q : list){
%>

<tr>

<td><%= q.getId() %></td>
<td><%= q.getQuestion() %></td>
<td><%= q.getTopic() %></td>
<td><%= q.getDifficulty() %></td>
<td><%= q.getCompany() %></td>

</tr>

<%
}
}else{
%>

<tr>
<td colspan="5" class="text-center">
No Questions Found
</td>
</tr>

<%
}
%>

</tbody>

</table>

<div class="text-center mt-3">

<a href="dashboard.jsp" class="btn btn-secondary">
🏠 Back to Dashboard
</a>

</div>

</div>

</div>

</body>
</html>