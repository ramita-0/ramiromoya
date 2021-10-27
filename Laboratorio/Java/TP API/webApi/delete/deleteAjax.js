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
            $("#response").text("done");
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