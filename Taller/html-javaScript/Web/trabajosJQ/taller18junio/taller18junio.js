function chequeoEdades()
{
    let nombre = $("#inputNombre").val();
    let apellido = $("#inputApellido").val();
    let edad = $("#inputEdad").val();
    
    $("#printNombre").text(nombre);
    $("#printApellido").text(apellido);
    $("#printEdad").text(edad);
}

function suma()
{
    let num1 = $("#primerOperando").val();
    let num2 = $("#segundoOperando").val();
    let resultado = parseFloat(num1) + parseFloat(num2);

    $("#rta").text(resultado);
}

function resta()
{
    let num1 = $("#primerOperando").val();
    let num2 = $("#segundoOperando").val();
    let resultado = parseFloat(num1) - parseFloat(num2);

    $("#rta").text(resultado)
}

function multiplicacion()
{
    let num1 = $("#primerOperando").val();
    let num2 = $("#segundoOperando").val();
    let resultado = parseFloat(num1) * parseFloat(num2);
    
    $("#rta").text(resultado);
}

function division()
{
    let num1 = $("#primerOperando").val();
    let num2 = $("#segundoOperando").val();
    let resultado = parseFloat(num1) / parseFloat(num2);

    $("#rta").text(resultado);

}