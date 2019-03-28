<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Music Library</title>

    <!-- Bootstrap core CSS -->
    <link href="../../css/editor.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="narrow-jumbotron.css" rel="stylesheet">
</head>

<body>
    <h1 style="margin-top: 50px; text-align: center; font-weight: 400; font-family: Verdana, Geneva, sans-serif; background-color: rgb(177, 254, 167);">Welcome to the music library</h1>
    <%--<div class="container" style=""></div>--%>
    <div class="btn-group" role="group" aria-label="Basic example" style=""> </div>
    <div class="btn-group-vertical" role="group" aria-label="Basic example" style=""> </div>
    <div class="btn-group-vertical" role="group" aria-label="Basic example" style="left: 650px; top: 50px;">
        <form action="/getAllTracks">
            <button button type="submit" value="/newTrackList" class="btn btn-secondary" style="width: 100px;  margin-left: -20px;">Tracks</button>
        </form>
        <form action="/getAllArtists">
            <button button type="submit" value="/newTrackList" class="btn btn-secondary" style="width: 100px; margin-top: 5px; margin-left: -20px;">Artists</button>
        </form>
        <form action="/getAllGenres">
            <button button type="submit" value="/newTrackList" class="btn btn-secondary" style="width: 100px; margin-top: 5px; margin-left: -20px;">Genres</button>
        </form>
        <form action="/getAllTracks">
            <button button type="submit" value="/newTrackList" class="btn btn-secondary" style="width: 100px; margin-top: 5px; margin-left: -20px;">About</button>
        </form>
        <form action="/getAllTracks">
            <button button type="submit" value="/newTrackList" class="btn btn-secondary" style="width: 100px;  margin-top: 5px; margin-left: -20px;">Help</button>
        </form>

    </div>
    <span class="badge badge-primary"  style="top: -20px; left: 0px; right: 0px; bottom: 0px; float: right;">Pavel and Vladimir</span>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>