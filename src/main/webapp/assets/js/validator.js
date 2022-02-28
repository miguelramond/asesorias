// Alphabetical validation method
jQuery.validator.addMethod("lettersonly", function(value, element) {
    return this.optional(element) || /^[a-z," "]+$/i.test(value);
  }, "Letters only please");   

// jQuery validate implementation
$().ready(function() {
    $("#signupForm").validate({
        // Validation rules for specified fields
        rules: {
            articulo: {
                required: true,
                lettersonly: true,
            },
            marca: "required",
            stock: {
                required: true,
                // Require only digits to be input in stock field
                digits: true,
            },
        },
        // Error messages if failed validation
        messages: {
            articulo: {
                required: "Favor ingresar nombre del artículo",
                lettersonly: "Favor ingresar sólo letras",
            },
            marca: {
                required: "Favor ingresar nombre del artículo",
                lettersonly: "Favor ingresar sólo letras",
            },
            stock: {
                required: "Favor ingresar cantidad de stock disponible",
                digits: "Favor ingresar un número válido",
            }, 
        },
    })
})
