<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta name="description" content="Juego llorona">
		<meta name="keywords" content="canvas colisiones jquery ajax">
		<meta name="author" content="Alejandro Daza">
		<title>La leyenda de la llorona</title>
		
		<link rel="stylesheet" type="text/css" href="estilos/default.css" media="screen">
				
	</head>
	<body>
            
            <form id="frmTest" name="frmTest" action="PuntajeLlorona" method="get">
        <input type="text" id="idJuego" name="idJuego" value="puntajeLlorona">
        <input type="text" id="puntos" name="puntos">
        <input type="submit" id="regreso" value="Regresar al menu de juegos">
            
        </form>
            
		<section>
			<canvas id="mi_canvas" width="640" height="480">
				Tu navegador no es compatible
			</canvas>			
		</section>
		
		<audio id="pierde">
			<source src="sonidos/pierde_vida.ogg" type="audio/ogg">
			<source src="sonidos/pierde_vida.mp3" type="audio/mpeg">
			<source src="sonidos/pierde_vida.wav" type="audio/wav">
			Tu navegador no es compatible
		</audio>
		
		<img id="abajo" src="imagenes/kika.png"/>
		<img id="arriba" src="imagenes/kika2.png"/>
		<img id="salto" src="imagenes/kika.png"/>
		<img id="sentado" src="imagenes/kika3.png"/>
		<img id="calaca_1" src="imagenes/calaca_child.png"/>
		<img id="calaca_2" src="imagenes/calaca_girl.png"/>
		
		<script src="js/jquery-1.11.0.min.js" language="JavaScript1.2"></script>
		<script src="js/quica.js" language="JavaScript1.2"></script>
		<script src="js/calaca.js" language="JavaScript1.2"></script>
		<script src="js/script.js" language="JavaScript1.2"></script>
                
	</body>
</html>
