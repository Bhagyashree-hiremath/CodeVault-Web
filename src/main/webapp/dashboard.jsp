<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>CodeVault Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" rel="stylesheet">

<style>

body{
    background:#0D1117;
    color:white;
    font-family:Arial, sans-serif;
}

.navbar{
    background:#161B22;
    box-shadow:0 0 10px rgba(0,0,0,.5);
}

.logo{
    color:#58A6FF;
    font-weight:bold;
}

.card{
    background:#161B22;
    border:none;
    border-radius:18px;
    transition:.4s;
    cursor:pointer;
    color:white;
}

.card:hover{
    transform:translateY(-8px);
    box-shadow:0 0 25px rgba(88,166,255,.4);
}

.icon{
    font-size:55px;
    color:#58A6FF;
}

a{
    text-decoration:none;
    color:white;
}

</style>

</head>

<body>

<nav class="navbar navbar-dark px-4 py-3">

<h3 class="logo">💻 CodeVault</h3>

<span>Welcome, Bhagyashree 👋</span>

</nav>

<div class="container mt-5">

<div class="row g-4">

<!-- Add Question -->

<div class="col-md-3">

<a href="addQuestion.jsp">

<div class="card p-4 text-center">

<i class="fa-solid fa-plus icon"></i>

<h4 class="mt-3">Add Question</h4>

</div>

</a>

</div>

<!-- View -->

<div class="col-md-3">

<a href="#">

<div class="card p-4 text-center">

<i class="fa-solid fa-book icon"></i>

<h4 class="mt-3">View Questions</h4>

</div>

</a>

</div>

<!-- Search -->

<div class="col-md-3">

<a href="#">

<div class="card p-4 text-center">

<i class="fa-solid fa-magnifying-glass icon"></i>

<h4 class="mt-3">Search</h4>

</div>

</a>

</div>

<!-- Analytics -->

<div class="col-md-3">

<a href="#">

<div class="card p-4 text-center">

<i class="fa-solid fa-chart-line icon"></i>

<h4 class="mt-3">Analytics</h4>

</div>

</a>

</div>

</div>

</div>

</body>
</html>