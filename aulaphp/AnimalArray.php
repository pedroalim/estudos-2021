<?php
    //ordenar
    //eliminar
    //verificar
    $animal = array("macaco", "mula", "burro", "chipanzé", "rato");

    sort($animal);

    foreach($animal as $chave => $valor){
        echo "ORDENAR = frutas[$chave] = $valor <br>";
    }

    unset($animal[4]);

    echo "<br>ELIMINAR <br>";
    print_r($animal);

    $novoAnimal = "mula";

    echo "<br> <br> VERIFICAR <br>";

    if (in_array($novoAnimal, $animal)){
        echo "tem $novoAnimal";
    } else {
        echo "não tem $novoAnimal";
    }

?>