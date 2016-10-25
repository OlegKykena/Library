<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resources/css/style.css">
<title>Insert title here</title>
</head>
<body>
<header>
    <nav class="navbar navbar-default menu">
  <div class="container">
 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     <!--  <a class="navbar-brand" href="#"><img src="img/logo.png" ></a> -->
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav ">
         <li class="active-link"><a href="/">головна</a></li>
        <li><a href="/news">новини</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">бібліотека <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/books">Книжки</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/authors">Автори</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/genres">Жанри</a></li>
          </ul>
        </li>
        <li ><a href="#">контакти <span class="sr-only">(current)</span></a></li>
        
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Пошук">
        </div>
        <button type="submit" class="btn btn-default">Вперед</button>
        <!-- Single button -->
<div class="btn-group">
 
<select class="form-control">
  <option>Назва</option>
  <option>Автор</option>
  
</select>
</div>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/login">логін</a></li>
        <li><a href="/registration">реєстрація</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
    <i class="glyphicon glyphicon-log-in" ></i>
  </div><!-- /.container-fluid -->
</nav>
 <canvas id="canvas-basic"></canvas>
</header>

    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

    <script href="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>