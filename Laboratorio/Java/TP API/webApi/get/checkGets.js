function checkInputError(){
    var id = $("#inputIdGet").val();

    var error = false;

    // si no hay input en el campo, da error
    if (id == ""){
        alert("Ingrese un id");
        return !error;
    }

    else {
        return error;
    }
}