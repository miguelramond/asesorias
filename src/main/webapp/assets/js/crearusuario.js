
var tipousuario = document.getElementsByName("tipousuario");
var cliente =  document.getElementById("cliente");
var administrativo =  document.getElementById("administrativo");
var profesional =  document.getElementById("profesional");

// Esconder los campos por defecto (Debug, block para mostrar)
cliente.style.display = 'none';   
administrativo.style.display = 'none';
profesional.style.display = 'none';

for(var i = 0; i < tipousuario.length; i++) {
    tipousuario[i].onclick = function() {
        // Crear variable que almacena valor de boton radio presionado
        var val = this.value;
        
        if(val == 'cliente'){
            cliente.style.display = 'block';
            administrativo.style.display = 'none';
            profesional.style.display = 'none';
            
        }else if(val == 'administrativo'){
            cliente.style.display = 'none';
            administrativo.style.display = 'block';
            profesional.style.display = 'none';
            
        }else if(val == 'profesional'){
            cliente.style.display = 'none';
            administrativo.style.display = 'none';
            profesional.style.display = 'block';
        }            
    }
}