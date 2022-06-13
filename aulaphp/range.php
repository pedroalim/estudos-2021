<?php
//range criar uma ordem ascendente

$numeros = range(1,100);

for($i = 0; $i <= 99; $i++){
    //echo "$numeros[$i] <br>";
}

$numerosPares = range(2,10,2);

for ($x = 0; $x <= 4; $x++){
    //echo "$numerosPares[$x] <br>";
}

$letras = range("a", "z");

for ($y = 0; $y <= 25; $y++){
    echo "$letras[$y] <br>";
}

?>