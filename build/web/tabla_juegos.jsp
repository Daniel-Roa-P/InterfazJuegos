<%-- 
    Document   : tabla_juegos
    Created on : 22/07/2019, 10:09:12 PM
    Author     : danbr
--%>

<html>
	
	<head>
		
		<title>Menu Juegos</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<meta charset="UTF-8">
		
	</head>
	<body>
	<div class="p-3 mb-2 bg-danger text-white">
		<div class="container" > 
		<table class="table table-striped table-hover">
			
			<thead class="thead-dark">
			
				<tr>
					
					<th>Numero Juego</th>
					<th>Nombre Juego</th>
					<th>Rankings</th>
				</tr>
				
			</thead>
				
			<tbody>
				
                        
				<tr>
					
					<td><strong>1</strong></td>
                                        <td><a href="Gallina/index.jsp">La gallina</a></td>
                                        <th><a href="Gallina/index.jsp">Rnking la gallina</a></th>
                                        
				</tr>
				
                        
                                
				<tr>
					
					<td><strong>2</strong></td>
                                        <td><a href="La_Llorona/index.jsp">La llorona</a></td>
					<td><a href="La_Llorona/index.jsp">Ranking la llorona</a></td>
                                        
				</tr>
				
				<tr>
					
					<td><strong>3</strong></td>
                                        <td><a href="Arkanoid/index.jsp">Arkanoid</a></td>
                                        <form id="frmTest" name="frmTest" action="ConexionTablas" method="get">
					<td><input type="submit" value="Ranking Arkanoid"></td>
                                        </form>
				</tr>
					
				<tr>
					
					<td><strong>4</strong></td>
                                        <td><a href="snake/Snake.jsp">La culebrilla</a></td>
					<td><a href="snake/Snake.jsp">Ranking culebrilla</a></td>
				</tr>
					
				<tr>
					
					<td><strong>5</strong></td>
                                        <td><a href="Carritos/index.jsp">Coches</a></td>
					<td><a href="Carritos/index.jsp">Ranking Coches</a></td>
				</tr>
				
				<tr>
					
					<td><strong>6</strong></td>
                                        <td><a href="Atari/index.jsp">Atari breakout</a></td>
					<td><a href="Atari/index.jsp">Ranking Atari breakout</a></td>
                                        
				</tr>
				
				<tr>
					
					<td><strong>7</strong></td>
                                        <td><a href="Pinguino/index.jsp">Ice penguin</a></td>
                                        <td><a href="Pinguino/index.jsp">Ranking Ice penguin</a></td>
					
				</tr>
			</tbody>
		</table>
		</div>
		</div>
	</body>

</html>