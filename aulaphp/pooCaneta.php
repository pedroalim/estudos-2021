<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>POO</title>
    </head>
    <body>
    </body>
</html>
<?php

    Class Caneta{
        var $modelo;
        var $cor;
        var $ponta;
        var $carga;
        var $tampa;
    
        function rabiscar(){
            if ($this->tampada == true){ 
                echo "<p>Erro! Não posso rabiscar</p>";
            } else {
                echo "<p>Estou rabiscando....</p>";
            }
        }

        function tampar(){
            $this->tampada = true;
        }

        function destampar(){
            $this->tampada = false;
        }

    }

    $c1 = new Caneta;
    $c1->modelo = "BIC";
    $c1->cor = "Azul";
    $c1->carga = "Completa";
    $c1->ponta = "0.5";
    $c1->tampada = false;
    $c1->rabiscar();

    print_r($c1);

    $c2 = new Caneta;
    $c2->modelo = "BIC";
    $c2->cor = "Vermelho";
    $c2->ponta = "0.7";
    $c2->carga = "Completa";
    $c2->tampar();
    $c2->rabiscar();

    print_r($c2); 
?>