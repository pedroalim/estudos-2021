<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>data </title>
</head>
<body>
    <form>
            <label>Informe a data</label>
            <input type="date" name="data">

            <input type="submit" name="enviar">
    </form>
</body>
</html>
<?php
    $data = $_GET["data"] = (isset($_GET["data"])) ? $_GET["data"] : null;;
    $arr_msg = explode("-", $data);
    $ano = $arr_msg[0];
    $mes = $arr_msg[1];
    $dia = $arr_msg[2];

    echo "Dia $dia <br> ";
    echo "Ano $ano <br> ";
    echo "Mes $mes <br>";
?>