function deletePorId(){
    var error = checkInputError();

    // si no hay error, hace la llamada ajax
    if (!error){

        var id = $("#inputIdDelete").val();
        
        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos/" + id,
            type: 'DELETE',
        })
    
        .done(function (data) {
            
            // se vacia el campo de id y se indica que fue exitosa la llamada
            $("#response").text("done");
            $("#inputIdDelete").val("");
        })
    
        .fail(function (jqXHR, textStatus, errorThrown) {
            $("#response").text("error al contactar la api");
            console.log("error, no se pudo ingresar los nuevos datos");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        });
    }
    
    else{
        $("#response").text("input error");
    }
}