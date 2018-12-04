<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="fdm-template.css" />
<link rel="stylesheet" href="main.css" />
<meta name="Pokemon Web Game"
	content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pokemon Web</title></head>
<body>


	<header> </header>
	<div class="row">
		<h1>A Wild Pokemon !</h1>
		
		<img src="Images/pokemon001.png">
	</div>
	<div class="row">
		<div class="col col--6">
			<form name="ballform" action="SafariActionController" method="post">
				<input type="submit" name="ball" value="Ball">
			</form>
		</div>
		<div class="col col--6 col--last">
			<form name="baitform" action="SafariActionController" method="post">
				<input type="submit" name="bait" value="Bait">
			</form>
		</div>
	</div>
	<div class="row">
		<div class="col col--6">
			<form name="rockform" action="SafariActionController" method="post">
				<input type="submit" name="rock" value="Throw Rock">
			</form>

		</div>
		<div class="col col--6 col--last">
			<a href=main-menu.html><input type="button" value="Run"></a>
		</div>
	</div>

</body>
</html>