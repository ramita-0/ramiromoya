function checkInputError(){
    var id = $("#inputIdGet").val();

    var error = false;

    if (id == ""){
        alert("Ingrese un id");
        return !error;
    }

    else {
        return error;
    }
}