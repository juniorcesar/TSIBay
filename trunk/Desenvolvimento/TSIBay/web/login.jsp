<%-- 
    Document   : login
    Created on : 04/09/2013, 08:35:41
    Author     : alauber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <body bgcolor="#c0c0c0">  
        <div align="center"><h2>Login do Sistema</h2></div>  
        <form action='LoginController' method="POST">  
            <p>Login:  
                <input type='text' name='login' value="alauber">   
            <p>Senha:  
                <input type='password' name='senha' value="alauber">   
            <p>  
                <input type='submit' value='Entrar'>  
        </form>  
    </body>
</html>
