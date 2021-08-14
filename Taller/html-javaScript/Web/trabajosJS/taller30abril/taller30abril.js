var margenX = 1;
var margenY = 1;

function botonIzquierda(){
    
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX - 1;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "cm";
}

function botonDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX + 1;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "cm";
}

function hoverUp(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenY - 1;
    margenY = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginTop = margenY + "cm";
}

function hoverDown(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenY + 1;
    margenY = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginTop = margenY + "cm";
}