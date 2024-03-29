<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Road Fighter UD</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
</head>

<body onload="main();">
    
    <form id="frmTest" name="frmTest" action="PuntajeCoches" method="get">
            <input type="text" id="idJuego" name="idJuego" value="puntajeCoches">
            <input type="text" id="puntos" name="puntos">
            <input type="submit" id="regreso" value="Regresar al menu de juegos">
    
    </form>
            
    <canvas id="gameBoard" width="1450" height="620"></canvas>
    <button id="again" onclick="restart()">Again!</button>

    <div id="scoreContainer">
        <div id="score">
            0
        </div>
    </div>

</body>

<script src="script/engine.js"></script>
<script src="script/board.js"></script>
<script src="script/car.js"></script>
<script src="script/controls.js"></script>
<script src="script/game.js"></script>
<script src="script/board-objects.js"></script>
</html>