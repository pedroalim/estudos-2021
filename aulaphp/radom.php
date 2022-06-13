<?php

$tentativas = 0;

while(true){
    $numSorteado = rand(0, 50);
    $tentativas++;
    echo "Número $numSorteado <br>";

    if ($numSorteado == 37){
        echo "Número encontrado em $tentativas tentativas";
        break;
    }
}
?>