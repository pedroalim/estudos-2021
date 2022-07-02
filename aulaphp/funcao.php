<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>
    <body>
        <form>
            <label>Digite um número moderno</label>
            <input type="number" name="numModerno">
            <br>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
<?php
    function romano($num){
        $num = str_replace(0, "- ❌ ",$num);
        $num = str_replace(1, "- I ",$num);
        $num = str_replace(2, "- II ",$num);
        $num = str_replace(3, "- III ",$num);
        $num = str_replace(4, "- IV ",$num);
        $num = str_replace(5, "- V ",$num);
        $num = str_replace(6, "- VI ",$num);
        $num = str_replace(7, "- VII ",$num);
        $num = str_replace(8, "- VIII ",$num);
        $num = str_replace(9, "- IX ",$num);

        return $num;
    }

    $numeroModerno = $_GET["numModerno"] = (isset($_GET["numModerno"])) ? $_GET["numModerno"] : null;
    $numeroModerno_r = romano($numeroModerno);

    echo "Número em romano = $numeroModerno_r";
?>