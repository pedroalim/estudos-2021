<?php
    echo "Hello Word!";
	$n1 = 7;
	$n2 = 7;
	$soma = $n1 + $n2;
	echo "<br>";
	echo "resultado = $soma"; //para concatenar é so colocar $ na variavel
	if($n1 <> $n2){		    //<> diferente
		echo "<br> DIFERENTE!";
	} else {
		echo "<br> IGUAIS!";
	}
	printf("<br>");
	var_dump($n1==$n2);    //mostra true or false
?>