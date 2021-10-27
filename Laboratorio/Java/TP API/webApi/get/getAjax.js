function getTodos(){
    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos",
        type: 'GET',
    })

    .done(function (data) {
        $("#response").text(JSON.stringify(data,null,"\t"));
    })

    .fail(function (jqXHR, textStatus, errorThrown) {
        $("#response").text("error al contactar la api");
        console.log("error, no se pudo ingresar los nuevos datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function getPorId(){

    var error = checkInputError();
    console.log(error);
    if (!error){

        var id = $("#inputIdGet").val();

        $.ajax({
            url: "http://localhost:8080/api/datos/alumnos/" + id,
            type: 'GET',
        })
    
        .done(function (data) {
            $("#response").text(JSON.stringify(data,null,"\t"));
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