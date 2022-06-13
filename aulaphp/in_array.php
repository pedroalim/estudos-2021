<?php
$jogo = array("warzone", "apex", "porcaria");

$novoJogo = "rocket league";

if (in_array($novoJogo, $jogo)){
    echo "Tem $novoJogo";
}
else {
    echo "Não tem $novoJogo";
}

?>