function post(){
    var error = checkInputError();
    
    if (error == false){
        var nombre = $("#inputNombrePost").val();
        var edad = $("#inputEdadPost").val();

        var objetoAlumno = {};
        objetoAlumno["nombre"] = nombre;
        objetoAlumno["edad"] = edad;

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos",
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(objetoAlumno)
        })

        .done(function (data) {
            // si es exitosa la llamada, se limpian los campos de input y se indica que fue exitoso
            $("#response").text("done");
            $("#inputNombrePost").val("");
            $("#inputEdadPost").val("");
        })

        .fail(function (jqXHR, textStatus, errorThrown) {
            $("#response").text("error al contactar la api");
            console.log("error, no se pudo ingresar los nuevos datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
    }

    else {
        $("#response").text("input error");
    }
}