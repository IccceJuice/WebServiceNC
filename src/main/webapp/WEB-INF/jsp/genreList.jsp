<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Album example for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../../css/editor.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="album.css" rel="stylesheet">
</head>
<body>
<div class="container" style="">
    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="">
    <a class="navbar-brand" href="/getHome">Music Library</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
    <div class="m-5">
    <div class="form-group" style=""></div>
        <select class="form-control" onchange="window.location.href=this.options[this.selectedIndex].value" style="text-align: left; width: 100px; left: 425px; text-decoration-line: none; float: left; position: relative; display: block; bottom: 60px;">
            <option value="/getAllTracks">Tracks</option>
            <option value="/getAllArtists">Artists</option>
            <option selected value="">Genres</option>
        </select>
    <c:if test="${!empty listOfGenres}">
    <table class="table" style="width: 700px; text-align: center; margin-top: 80px;">
        <thead>
        <tr>
            <th width="80">Id</th>
            <th width="120">Genre Name</th>
            <th width="120">Rating</th>
            <th width="120">Tracks</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listOfGenres}" var="genre">
            <tr>
                <td>${genre.id}</td>
                <td>${genre.name}</td>
                <td>${genre.rating}</td>
                <td>${genre.tracks}</td>
                <td><a href="<c:url value='/updateGenre/${genre.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/deleteGenre/${genre.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table></div>
</div>
<div class="row" style="">
    <div class="col-sm-4"></div>
    <div class="col-sm-4 col-5"></div>
    <div class="col-sm-4"></div>
</div>
<nav aria-label="Page navigation example" style="">
    <ul class="pagination" style="text-align: left; float: left; position: relative; left: 500px;">
        <li class="page-item">
            <a class="page-link" href="#" style="left: 60px;">Previous</a>
        </li>
        <li class="page-item">

        </li>
        <li class="page-item">

        </li>
        <li class="page-item">

        </li>
        <li class="page-item">
            <a class="page-link" href="#" style="top: 0px; left: 60px;">Next</a>
        </li>
    </ul>
    </c:if>
</nav>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>