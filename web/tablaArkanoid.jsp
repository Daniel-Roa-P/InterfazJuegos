<%-- 
    Document   : tablaArkanoid
    Created on : 23/07/2019, 08:36:54 AM
    Author     : danbr
--%>

<%@page import="Datos.DBconexion"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% ResultSet tablaArkanoid = (ResultSet)session.getAttribute("puntajes");%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="EstiloIndex.css"/>
        <title>Tabla puntajes</title>
    </head>
    <body>
        <h1>puntuaciones de Arkanoid</h1>
        <table>
            <tr>
                <th>Nombre</th><th>Puntaje</th>
            </tr>
            
             <% while (tablaArkanoid.next()){ %>
                    <tr>
                        <td><%= tablaArkanoid.getString("idUsuario") %></td>       
                        <td><%= tablaArkanoid.getString("puntajeArkanoid") %></td>
                    </tr>
                    
                <% }%>
                
                <tr>
                    <td colspan="2" class="links"><a href="tabla_juegos.jsp">Regresar a la seleccion de juegos</a></td>
                </tr>
            
        </table>
    </body>
</html>
