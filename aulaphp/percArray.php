<?php
    $componentes = array ("HD", "CPU");
    $componentes[2] = "memória";

    $componentes[] = "Teclado";
    $componentes[] = "Mouse";

    for ($x = 0; $x <= 4; $x++){
        echo "$componentes[$x] <br>";
    }
?>