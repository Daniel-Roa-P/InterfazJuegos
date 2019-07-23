
var jugando;

$(document).ready(inicio);
$(document).keydown(capturaTeclado);

function inicio(){
	jugando = true;
	miCanvas = $("#mi_canvas")[0];
	contexto = miCanvas.getContext("2d");
	buffer = document.createElement("canvas");
	gallina = new gallina();
	obstaculo = [new obstaculo(), new obstaculo(),
				   new obstaculo(), new obstaculo(),
				   new obstaculo()];
	run();	
	
        document.getElementById('puntos').value = gallina.puntos;
        
	$('#instrucciones').click(function(){
        $('#popup').fadeIn('slow');
        $('.popup-overlay').fadeIn('slow');
        $('.popup-overlay').height($(window).height());
        return false;
    });
    
    $('#close').click(function(){
        $('#popup').fadeOut('slow');
        $('.popup-overlay').fadeOut('slow');
        return false;
    });
    
    $("#iniciar").click(function(){	
		if(jugando==false)
			inicio();	
	});
}

function capturaTeclado(event){
	if(event.which==38 || event.which==87)
		gallina.actualizar('arriba');
	if(event.which==40 || event.which==83)
		gallina.actualizar('abajo');
	if(event.which==39 || event.which==68)
		gallina.actualizar('derecha');
	if(event.which==37 || event.which==65)
		gallina.actualizar('izquierda');
	
        document.getElementById('puntos').value = gallina.puntos;
        
}

function run(){ 
    
	buffer.width = miCanvas.width;
	buffer.height = miCanvas.height;
	contextoBuffer = buffer.getContext("2d");
        document.getElementById('puntos').value = gallina.puntos;
                 
	if(jugando){  
		contextoBuffer.clearRect(0,0,buffer.width,buffer.height);

		gallina.dibujar(contextoBuffer);
		for(i=0;i<obstaculo.length;i++){
			obstaculo[i].dibujar(contextoBuffer);
			obstaculo[i].actualizar();
			if(gallina.colision(obstaculo[i].x,obstaculo[i].y)){
				gallina.sprite = 2;
				gallina.vida--;
				$('#pierde')[0].play();
			}
		}
		
		if(gallina.vida <= 0)
			jugando = false;
		
		contexto.clearRect(0,0,miCanvas.width,miCanvas.height);
		contexto.drawImage(buffer, 0, 0);
		setTimeout("run()",20);
		
                
	}else{
                
		contextoBuffer.clearRect(0,0,buffer.width,buffer.height);
		contextoBuffer.fillStyle = "#ffffff";
		gallina.sprite = 3;
		gallina.vida = 0;
		gallina.dibujar(contextoBuffer);
		contextoBuffer.font = "30px sans-serif";
		contextoBuffer.fillText("Estas Frito", 300, 400);
		contextoBuffer.fillStyle = "#ff0000";
		contextoBuffer.font = "15px sans-serif";
		contextoBuffer.fillText("intentar de nuevo", 300, 450);
		contexto.clearRect(0,0,miCanvas.width,miCanvas.height);
		contexto.drawImage(buffer, 0, 0);
	}
	
}


