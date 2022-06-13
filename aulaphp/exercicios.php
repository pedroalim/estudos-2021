<html>
<head></head>
	<body>
		<form>
		    <h3> Lucas Pontes Soares 2ºDS </br>
			<h1>EXERCICIOS</h1>
			
			<h1>1) Número positivo negativo</h1>
			<label>Digite um número</label>
			<input type="number" name="x">
			
			<h1>2 Número par ou impar</h1>
			<label>Digite um número</label>
			<input type="number" name="num">
			
			<h1>3) Ordem crescente</h1>
			<label>Digite um número A:</label>
			<input type="number" name="cresA"> <br>
			<label>Digite outro número B:</label> 
			<input type="number" name="cresB">
			
			<h1>4) Maior ou menor</h1>
			<label>Digite um número A:</label> 
			<input type="number" name="a"> <br>
			<label>Digite outro número B:</label>
			<input type="number" name="b">
			
			<h1>5) Maior ou menor de idade</h1>
			<label>Digite seu nome</label> 
			<input type="text" name="nome"> <br>
			<label>Digite sua idade</label>
			<input type="number" name="idade">
						
			<h1>6) Número de mes</h1>
			<label>Digite um número do mes</label>
			<input type="number" name="mes">
			
			<br>
			<br>
			<input type="submit" name="Enviar">
			
		</form>
		    <h1> RESPOSTAS:</h1>
	</body>
</html>

<?php
	$nome = $_GET["nome"];
	$idade = $_GET["idade"];
	$num = $_GET["num"];
	$x = $_GET["x"];
	$mes = $_GET["mes"];
	$a = $_GET["a"];
	$b = $_GET["b"];
    $cresA = $_GET["cresA"];
	$cresB = $_GET["cresB"];
	
	//POSITIVO NEGATIVO
	if ($x > 0){
		echo "<br>1) número positivo";
	} else if ($x < 0){
		echo "<br>1) número negativo";
	} else{
		echo "<br>1) número nulo";
	}
	
	//PAR IMPAR
	if ($num%2 == 0){
		echo "<br><br>2) numero é par";
	} else {
		echo "<br><br>2) numero é impar";
	}
	
	//ORDEM CRESCENTE
	if ($cresA > $cresB){
		echo "<br> <br>3) Ordem crescente: $cresA , $cresB";
	} else {
		echo "<br> <br>3) Ordem crescente: $cresB , $cresA";
	}
	
	//NUMERO MAIOR E MENOR
	if ($a > $b){
		echo "<br> <br>4) o número A é maior que o B";
	} else if($b > $a){
		echo "<br> <br>4) o número B é maior que o A";
	} else if($a == $b){
		echo "<br> <br>4) Os números A e B são iguais";
	}
	
	//MAIOR DE IDADE
	if($idade < 18){
		echo "<br> <br>5) $nome , é MENOR de idade com: $idade anos";
	} else {
		echo "<br> <br>5) $nome , é MAIOR de idade com: $idade anos";
	}

	//NUMERO MES
	switch($mes){
		case 1: 
			echo " <br> <br>6) janeiro";
			break;
		case 2: 
			echo " <br> <br>6) fevereiro";
			break;
		case 3:
		    echo "<br> <br>6) março";
			break;
		case 4:
		    echo "<br> <br>6) abril";
			break;
		case 5:
		    echo " <br> <br>6) maio";
			break;
		case 6:
		    echo " <br> <br>6) junho";
			break;
		case 7:
		    echo " <br> <br>6) julho";
			break;
		case 8:
		    echo " <br> <br>6) agosto";
			break;
		case 9:
		    echo " <br> <br>6) setembro";
			break;
		case 10:
		    echo "<br <br>6) outubro";
			break;
		case 11:
			echo "<br> <br>6) novembro";
			break;
		case 12:
			echo "<br> <br>6) dezembro";
			break;
		default: 
			echo "<br> <br>6) mes invalido";
			break;
	}
    
?>