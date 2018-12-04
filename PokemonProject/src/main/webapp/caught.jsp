<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <link rel="stylesheet" href="fdm-template.css" />
    <link rel="stylesheet" href="main.css" />
    <meta name="Pokemon Web Game" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Pokemon Web</title>
</head>

<body>
    <p> All Right! <%request.GetParameter("wildPokemon").getName().getName()%> was caught!</p>
    <p> New Pokedex Data will be added for <%request.GetParameter("wildPokemon").getName().getName()%> </p>
    
   <p><%request.GetParameter("wildPokemon").getName().getName()%> will be added to your PC </p>
    

</body>

</html>
