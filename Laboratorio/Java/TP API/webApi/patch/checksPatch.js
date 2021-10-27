function checkInputError(){
    var nombre = $("#inputNombrePatch").val();
    var edad = $("#inputEdadPatch").val();
    var id = $("#inputIdPatch").val();

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
    else if (id == ""){
        alert("Ingrese un id");
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

    
    if (noError == true && numero == false){
        // si no hay errores
        return false
    }
    else {
        //si hay errores
        return true;
    }
}