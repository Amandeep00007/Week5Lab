<%-- 
    Document   : login
    Created on : 12-Feb-2023, 12:53:26 AM
    Author     : amand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action = "login" method = "post">
            Username: <input type ="text" name ="username" value ="${username}"> <br> <br>
            Password: <input type ="text" name ="password" value ="${password}"> <br> <br> 
            
            <input type ="submit" value ="Log in"> <br> <br>
            
            <p>${message}</p> 
        </form>
    </body>
</html>
