<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Exercicios</title>
    </head>
    <body>
        <form>
            <h1>Exercicio 1:</h1>
            <label>Informe o seu nome:</label>
            <input type="text" name="nome" required>
            <br>
            <label>Informe sua idade:</label>
            <input type="text" name="idade" required>
            <br>
            <label>Informe o sexo:</label>
            <br>
            <label for="homem">Masculino 👦</label>
            <input type="radio" name="InfSexo" value="M" required id="homem">
            <br>
            <label for="mulher">Feminino 👩 </label>
            <input type="radio" name="InfSexo" value="F" required id="mulher">

            <h1>Exercico 2:</h1>
            <br>
            <label>Informe um número: </label>
            <input type="number" name="numero" required>

            <h1>Exercicio 3:</h1>
            <br>
            <label>Informe o primeiro número: </label>
            <input type="number" name="numA" required>
            <label>Informe o segundo número:</label>
            <input type="number" name="numB" required>
            
            <h1>Exericio 4:</h1>
            <br>
            <label>Informe o primeiro número: </label>
            <input type="number" name="PrNum" required>
            <label>Informe o segundo número: </label>
            <input type="number" name="SgNum" required>
            <label>Informe o terceiro número: </label>
            <input type="number" name="TrNum" required>

            <h1>Exercicio 5: </h1>
            <label>Informe o primeiro lado do triangulo: </label>
            <input type="number" name="lado1" required>
            <label>Informe o segundo lado do triangulo: </label>
            <input type="number" name="lado2" required>
            <label>Informe o terceiro lado do triangulo: </label>
            <input type="number" name="lado3" required>

            <br> 
            <input type="submit" name="Enviar">
        </form>
    </body>
</html>

<?php
    $nome = $_GET["nome"] = (isset($_GET["nome"])) ? $_GET["nome"] : null;
    $idade = $_GET["idade"]  = (isset($_GET["idade"])) ? $_GET["idade"] : null;
    $sexo = $_GET["InfSexo"] = (isset($_GET["InfSexo"])) ? $_GET["InfSexo"] : null;
    $numero = $_GET["numero"] = (isset($_GET["numero"])) ? $_GET["numero"] : null;
    $numA = $_GET["numA"] = (isset($_GET["numA"])) ? $_GET["numA"] : null;
    $numB = $_GET["numB"] = (isset($_GET["numB"])) ? $_GET["numB"] : null;
    $PrNum = $_GET["PrNum"] = (isset($_GET["PrNum"])) ? $_GET["PrNum"] : null;
    $SgNum = $_GET["SgNum"] = (isset($_GET["SgNum"])) ? $_GET["SgNum"] : null;
    $TrNum = $_GET["TrNum"] = (isset($_GET["TrNum"])) ? $_GET["TrNum"] : null;
    $numB = $_GET["numB"] = (isset($_GET["numB"])) ? $_GET["numB"] : null;
    $soma = 0;

    //EXERCICIO 1
    if ($sexo == "F" && $idade <= 25){
        echo "ACEITO";
    } else {
        echo "NEGADO";
    }

    //EXERCICIO 2
    if ($numero%2 == 0){
        echo "<br> $numero é divisivel por 2";
    }
    if ($numero%5 == 0){
        echo "<br> $numero é divisivel por 5";
    }
    if ($numero%10 == 0){
        echo "<br> $numero é divisivel por 10";
    }

    //EXERCICIO 3
    $soma = $numA + $numB;

    if($soma > 20){
        $soma = $soma + 8;
        echo "<br> Novo valor: $soma";
    } else if ($soma <= 20){
        $soma = $soma - 5;
        echo "<br> Novo valor: $soma";
    }

    //EXERCICIO 4


    //EXERCICIO 5
    if ($lado1 == $lado2 || $lado1 == $lado2 || $lado2 == $lado3){
        echo "<br> Triangulo isoceles = 2 lados iguais";
    } else if ($lado1 != $lado2 $$ $lado1 != $lado3 $$ $lado2 != $lado3){
        echo "<br> Triangulo escaleno = nenhum lado iguais";
    } else if($lado1 == $lado2 $$ $lado1 == $lado3 $$ $lado2 == $lado3){
        echo "<br> Triangula equilatero = todos os lados iguais";
    }

    //EXERCICIO 6


?>
