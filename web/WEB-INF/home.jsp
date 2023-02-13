<%-- 
    Document   : home
    Created on : 12-Feb-2023, 12:54:46 AM
    Author     : amand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>
        <h2> Hello ${user.username} </h2>
        <a href ="login?login"> Log out</a>
        
    </body>
</html>
