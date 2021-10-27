function checkInputError(){
    var id = $("#inputIdDelete").val();

    var error = false;

    // si el campo esta vacio da error
    if (id == ""){
        alert("Ingrese un id");
        return !error;
    }

    else {
        return error;
    }
}