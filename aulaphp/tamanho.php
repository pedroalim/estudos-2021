<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>ContarQuantidade</title>
</head>
<body>
    <form method="GET">
        <label>Escreva a palavra <input type="text" name="txtPalavra" required></label>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

<?php
    $palavra = $_GET["txtPalavra"] = (isset($_GET["txtPalavra"])) ? $_GET["txtPalavra"] : null;
    $tamanho = strlen($palavra);

    echo ("$tamanho");
?>