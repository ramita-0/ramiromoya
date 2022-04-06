function mostrarElementos()
{
    document.getElementById("input1").style.visibility = "visible";
    document.getElementById("input2").style.visibility = "visible";
    document.getElementById("input3").style.visibility = "visible";
    document.getElementById("insertarDatos").style.visibility = "visible";
}

function ocultarElementos()
{
    document.getElementById("input1").style.visibility = "hidden";
    document.getElementById("input1").value = "";
    document.getElementById("input2").style.visibility = "hidden";
    document.getElementById("input2").value = "";
    document.getElementById("input3").style.visibility = "hidden";
    document.getElementById("input3").value = "";
    document.getElementById("insertarDatos").style.visibility = "hidden";
}

function addData()
{
    var fila = tabla.insertRow(-1);

    for (var i = 0; i < 3; i ++)
    {
        var celda = fila.insertCell(i)

        if (i == 0)
        {
            var input = document.getElementById("input1").value;
            celda.innerHTML = input
        }

        else if (i == 1)
        {
            var input = document.getElementById("input2").value;
            celda.innerHTML = input
        }

        else 
        {
            var input = document.getElementById("input3").value;
            celda.innerHTML = input
        }
    }

    ocultarElementos();
}

function boton()
{
    var randomColor = Math.floor(Math.random()*16777215).toString(16);
    var randomBackground = Math.floor(Math.random()*16777215).toString(16);
    var randomFontSize = Math.floor(Math.random()*30).toString();
    var botonNuevosDatos = $("#nuevosDatos")
    var alerta = $("#alert")

    $(botonNuevosDatos).css({"color" : "#" + randomColor, "font-size" : randomFontSize +"px", "background-color" : "#" + randomBackground});

    $(alerta).html("Se ha modificado el elemento 'nuevosDatos' <br> Se le cambio el color a: #" + randomColor + "<br> Su fuente paso a ser de: " + randomFontSize + "px" + "<br> Y el color del fondo se cambio a: #" + randomBackground)

    alert("Se ha modificado el elemento 'nuevosDatos', se le cambio el color a #" + randomColor + ", su fuente paso a ser de " + randomFontSize + "px" + " y el color del fondo se cambio a #" + randomBackground)
}