function postAlumno(){
    var nombre = $("#inputNombre").val();
    var edad = $("#inputEdad").val();
    
    var noError = true;

    //check nulls en campos
    if (nombre == ""){
        alert("Ingrese un nombre");
        noError = false;
    }
    else if (edad == ""){
        alert("Ingrese una edad");
        noError = false;
    }

    //check que no hayan numeros en el campo de nombre
    var numero = false;
    for (var i = 0; i < nombre.length && numero == false; i++){
    
        var char = nombre.charAt(i).charCodeAt(0);
        
        if (char >= 65 && char <= 90 || char >= 97 && char <= 122){
        
        }
        else {
            alert("Ingrese un nombre valido");
            numero = true;
        }
    }
    
    //si no hay errores crea el objeto
    if (noError == true && numero == false){
        var objetoAlumno = {};
        objetoAlumno["nombre"] = nombre;
        objetoAlumno["edad"] = edad;
        console.log(objetoAlumno);

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos",
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(objetoAlumno)
        })
        .done(function (data) {
            
        })
        .fail(function (jqXHR, textStatus, errorThrown) {
            console.log("error, no se pudo ingresar los nuevos datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
    }

}