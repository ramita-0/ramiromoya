function patch(){

    var error = checkInputError();

    if (!error){

        var id = $("#inputIdPatch").val();
        var nombre = $("#inputNombrePatch").val();
        var edad = $("#inputEdadPatch").val();

        // creo el objeto en base a los datos de los campos
        var objetoAlumno = {};
        objetoAlumno["id"] = id;
        objetoAlumno["nombre"] = nombre;
        objetoAlumno["edad"] = edad;

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos",
            type: 'PATCH',
            contentType: "application/json",
            data: JSON.stringify(objetoAlumno)
        })

        .done(function (data) {

            // vacia los campos e indica q fue exitosa la llamada
            $("response").text("done");
            $("#inputIdPatch").val("");
            $("#inputNombrePatch").val("");
            $("#inputEdadPatch").val("");
        })

        .fail(function (jqXHR, textStatus, errorThrown) {
            console.log("error, no se pudo ingresar los nuevos datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
    }   
}