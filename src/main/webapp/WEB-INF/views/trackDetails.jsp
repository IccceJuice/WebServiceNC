<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="track" action="/MusicLibrary/addTrack">
<table>
		<tr>
			<th colspan="2">Add Track</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="name">Track Name:</form:label></td>
          <td><form:input path="name" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			<td><form:label path="album">Album:</form:label></td>
            <td><form:input path="album" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="duration">Duration:</form:label></td>
			<td><form:input path="duration" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Track List</h3>
<c:if test="${!empty listOfTracks}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Track Name</th>
		<th width="120">Album</th>
		<th width="120">Duration</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfTracks}" var="track">
		<tr>
			<td>${track.id}</td>
			<td>${track.name}</td>
			<td>${track.album}</td>
			<td>${track.duration}</td>
			<td><a href="<c:url value='/updateTrack/${track.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteTrack/${track.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
