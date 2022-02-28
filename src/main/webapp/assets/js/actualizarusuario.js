var tipousuario = document.getElementById("tipousuario").value;
var cliente =  document.getElementById("cliente");
var administrativo =  document.getElementById("administrativo");
var profesional =  document.getElementById("profesional");

// Esconder los campos por defecto (Debug, block para mostrar)
cliente.style.display = 'none';   
administrativo.style.display = 'none';
profesional.style.display = 'none';

console.log(tipousuario);
	
if(tipousuario == '1'){
    cliente.style.display = 'block';
    administrativo.style.display = 'none';
    profesional.style.display = 'none';
    
}else if(tipousuario == '2'){
    cliente.style.display = 'none';
    administrativo.style.display = 'block';
    profesional.style.display = 'none';
    
}else if(tipousuario == '3'){
    cliente.style.display = 'none';
    administrativo.style.display = 'none';
    profesional.style.display = 'block';
}     
     
	