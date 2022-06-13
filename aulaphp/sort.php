<?php

$frutas = array("limão", "uva", "abacaxi", "melancia");

sort($frutas);
//imprimir em ordem alfabetica
// rsort -> ordem albabetica ao contrario


foreach($frutas as $chave => $valor){
    echo "frutas[$chave] = $valor <br>";
}

?>