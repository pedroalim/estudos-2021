<?php
// embaralhar

$animais = array("macaco", "mula", "jamanta", "burro");

shuffle($animais);
// foreach para cada[]
// as -> como

foreach($animais as $chave => $animais){
    echo "animais[$chave] = $animais <br>";
}

?>