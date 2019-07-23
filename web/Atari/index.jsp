<!DOCTYPE html>
<html>
    <head>
        <title>Juego Propio</title>
        <link href="stilo.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        
        <form id="frmTest" name="frmTest" action="PuntajesAtari" method="get">
        <input type="text" id="idJuego" name="idJuego" value="puntajeAtari">
        <input type="text" id="puntos" name="puntos">
        
            <input type="submit" id="regreso" value="Regresar al menu de juegos">
        
        <canvas id="myCanvas" width="800" height="320"></canvas>
        <script src="logica.js" type="text/javascript"></script>
        
        </form>
        
    </body>
    
</html>