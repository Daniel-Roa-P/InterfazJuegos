
<html>
    <head>
        <title>Arkanoid</title>
        <link rel="stylesheet" type="text/css" href="Estilo.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <form id="frmTest" name="frmTest" action="PuntajeServlet" method="get">
        <input type="text" id="idJuego" name="idJuego" value="puntajeArkanoid">
        <input type="text" id="puntos" name="puntos">
        <input type="submit" id="regreso" value="Regresar al menu de juegos">
            
        </form>
        
        <div id="Juego">
            <canvas id="canvas"></canvas>
                <div id="modelo">
                    
                    <button id="inicio">
                        <img src="Imagenes/jugar.jpg "/>
                    </button>
                                       
                </div>                 
        </div>
        <script src="juego_arkanoid.js"></script>
        
        
        
    </body>
</html>
