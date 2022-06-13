<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TesteCEP</title>
</head>
<body>
<form method="GET">
        <label>Escreva seu CEP <input type="text" name="txtCep" required></label>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

<?php
  $cep = $_GET["txtCep"] = (isset($_GET["txtCep"])) ? $_GET["txtCep"] : null;
  $cep = substr($cep, -3);

  echo ("$cep");
?>