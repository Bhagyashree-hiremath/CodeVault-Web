<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CodeVault Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#0D1117;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
    color:white;
}

.login-box{
    background:#161B22;
    width:400px;
    padding:40px;
    border-radius:20px;
    box-shadow:0 0 20px rgba(88,166,255,.3);
}

h2{
    text-align:center;
    color:#58A6FF;
    margin-bottom:30px;
}

.form-control{
    background:#21262D;
    color:white;
    border:none;
}

.form-control:focus{
    background:#21262D;
    color:white;
    box-shadow:none;
    border:1px solid #58A6FF;
}

.btn-login{
    width:100%;
    background:#58A6FF;
    color:black;
    font-weight:bold;
}

.btn-login:hover{
    background:#3B82F6;
    color:white;
}

.error{
    color:red;
    text-align:center;
    margin-bottom:15px;
}

</style>

</head>

<body>

<div class="login-box">

<h2>🔐 CodeVault Login</h2>

<%
String error=(String)request.getAttribute("error");
if(error!=null){
%>

<p class="error"><%=error%></p>

<%
}
%>

<form action="LoginServlet" method="post">

<div class="mb-3">

<label>Email</label>

<input
type="email"
name="email"
class="form-control"
required>

</div>

<div class="mb-3">

<label>Password</label>

<input
type="password"
name="password"
class="form-control"
required>

</div>

<button class="btn btn-login">
Login
</button>

</form>

</div>

</body>
</html>