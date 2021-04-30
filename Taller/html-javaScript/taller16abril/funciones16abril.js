function cantApariciones(array,n){
    var contador = 0;
    for(var i = 0; i < array.length; i++){
      if(n == array[i]){
        contador++;
      }
    }
    return contador;
}
//no funciona
function posibleMailValido(){
    var posibleMail = document.getElementById("posibleMail").value;
    var check = 0;
    for(var i = 0; i < posibleMail.length; i++){
        if(i == 0 && posibleMail[i] != '@') check++;
        else if(i == posibleMail.length - 1 && posibleMail[i] != '@') check++;
        else if(posibleMail[i] == '@') check++;
    }
    if(check == 3) document.getElementById("return").innerHTML = "Mail posiblemente valido";
    else document.getElementById("return").innerHTML = "Mail invalido";
}

function posibleTelefonoValido(){
    var posibleTelefono = document.getElementById("posibleTelefono").value;
    var check = false;

    if(posibleTelefono.length == 11){
        if(posibleTelefono[0] == 0 && posibleTelefono[1] == 1 && posibleTelefono[2] == 1) check=true;
    }
    else if(posibleTelefono.length == 10){
        if(posibleTelefono[0] == 1 && posibleTelefono[1] == 1) check=true;
    }
    else{
        check=false
    }
    //test, preguntar por que no anda
    if(check == true) document.getElementById("return").innerHTML = "Telefono valido";
    else document.getElementById("return").innerHTML = "Telefono invalido";
}