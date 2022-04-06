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

function desaparecer(){
    let cuadrado = document.getElementById("cuadrado");
    let posicionXdeCuadrado = cuadrado.getBoundingClientRect().x;
    let posicionYdeCuadrado = cuadrado.getBoundingClientRect().y;
    let cuadrado2 = document.getElementById("cuadrado2");
    let posicionXdeCuadrado2 = cuadrado2.getBoundingClientRect().x;
    let posicionYdeCuadrado2 = cuadrado2.getBoundingClientRect().y;
    if (posicionXdeCuadrado == posicionXdeCuadrado2 && posicionYdeCuadrado == posicionYdeCuadrado2){
        cuadrado2.style.display = "none";
    }
}

