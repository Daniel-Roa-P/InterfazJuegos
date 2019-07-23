
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="EstiloIndex.css"/>
        <title>Super Mario</title>
    </head>
    
    <body>
        
        <form id="frmTest" name="frmTest" action="ConexionServlet" method="get">

        <table border="3">
            <tr>
                <td colspan="2">
                    <h1>Iniciar sesión</h1>
                </td>
            </tr>
            
            <tr>
                <td>
                    <h2>Usuario </h2>
                </td>
                
                <td>
                    <input type="text" name="Usuario">
                </td>
            </tr>
            
            <tr>
                <td>
                    <h2>Contraseña </h2>
                </td>
                
                <td>
                    <input type="text" name="Contraseña">
                </td>
            </tr>
        
            <tr>
                
                <td colspan="2">
                
                    <center>
                
                    <input type="submit" value="Ingresar">
                
                    </center>
            
                </td>
            
             </tr>
                
            </form>
            
        </table>
        
    </body>
</html>
