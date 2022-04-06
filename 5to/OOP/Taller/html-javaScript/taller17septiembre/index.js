

function testapi(){
    $.ajax({
        url: "https://www.fruityvice.com/api/fruit/banana",
        type: 'GET'
    })
    .done(function (data) {
        console.log(data);
        $("#jsonOutput").text(JSON.stringify(data, null, 1));
    })
    .fail(function (qXHR, textStatus, errorThrown) {
        console.log("error, no se pudo obtener datos");
        $("#jsonOutput").text(textStatus)
    });
}