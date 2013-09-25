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
        <div align="left"><h2>Login do Sistema</h2></div>  
        <form action='LoginController' method="POST">  
            <table width="100" border="0" cellpadding="10" cellspacing="10">
                <tr>
                    <td width="80">Login:</td>
                    <td>
                        <input type='text' name='login' value="alauber"> 
                    </td>
                </tr>
                <tr>
                    <td width="80">Senha:</td>
                    <td>
                        <input type='password' name='senha' value="alauber"> 
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type='submit' value='Entrar'>  
                    </td>
                </tr>
            </table>
        </form>  
    </body>
</html>
