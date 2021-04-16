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
    var posibleMail = document.getElementById("posibleMail");
    var check = 0;
    for(var i = 0; i < posibleMail.length){
        if(i == 0 && posibleMail[i] != '@') check++;
        else if(i == posibleMail.length && posibleMail[i] != '@') check++;
        else if(i == '@') check++;
    }
    if(check == 3) document.getElementById("return").innerHTML = "mail valido";
    else document.getElementById("return").innerHTML = "mail invalido";
}

function posibleTelefonoValido(){
    var posibleTelefono = document.getElementById("posibleTelefono");
    var check = false;
    if(posibleMailValido.length == 11){
        if(posibleMailValido[0] == 0 && posibleMailValido[1] == 1 && posibleMailValido[2] == 1) check=true;
    }

    else if(posibleMailValido.length == 10){
        if(posibleMailValido[0] == 1 && posibleMailValido[1] == 1) check=true;
    }

    else{
        check=false
    }
    //test, preguntar por que no anda
    if(check = true) document.body.style.backgroundColor = "red";
    else document.body.style.backgroundColor = "red";
}