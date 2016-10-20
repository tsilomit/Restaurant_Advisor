<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    
<head>
<link href="firstcss.css" type="text/css" rel="stylesheet" />
<%
  String username = (String) request.getAttribute("username");


    out.print("<title>Restaurant Advisor></title>" + " User:"+ username + "\n");
  

%>
<form method = "post" action = "logout">
    <input type = "submit" value = "Logout"/>
</form>
</head>

<body>
  <h1 align="center">Restaurant Advisor </h1>
  <form method="POST" action="SelectRestaurant.do">
    Select Restaurant 
    Type:
    <select name="type" size="1">
      <option value="Fast Food">Fast Food</option>
      <option value="Ethnic">Ethnic</option>
      <option value="Traditional">Traditional</option>
      <option value="Family Restaurant">Family Restaurant</option>
    </select>
    <br><br>
    <center>
      <input type="Submit">
    </center>
   </form>

</body>
</html>
