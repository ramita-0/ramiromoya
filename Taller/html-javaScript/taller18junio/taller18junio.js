function chequeoEdades(){
    let nombre = $("#inputNombre").val();
    let apellido = $("#inputApellido").val();
    let edad = $("#inputEdad").val();
    
    $("#printNombre").text(nombre);
    $("#printApellido").text(apellido);
    $("#printEdad").text(edad);

    if ( edad >= 18 ) {
        $("body").css("background-color","blue")
    }

    else if ( edad == "" || edad == "Edad") {
        $("body").css("background-color","white")
    }
    
    else {
        $("body").css("background-color","green")
    }
}