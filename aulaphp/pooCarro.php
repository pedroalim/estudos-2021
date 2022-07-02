<?php
    Class Carro{
        public $cor;
        public $modelo;
        public $quantPortas;
        public $velocidade;
        var $chave;
        var $buzina;

        function ligar(){
            if ($this->chave == true){
                echo "<br> carro ligado";
            } else {
                echo "<br> carro desligado";
            }
        }
        
        function buzinar(){
            if($this->buzina == "funcionando"){
                echo "<br> buzinei = BI BI BI";
            } else {
                echo "<br> buzina não funcionado";
            }
        }
    
        function voar(){
            if($this->velocidade >= 200){
                echo "<br> carro muito rápido = VRUUUMM";
            } else {
                echo "<br> carro andando normalmente";
            }
        }
    }

        $c1 = new Carro;
        $c1->cor = "Preto";
        $c1->modelo = "Ford";
        $c1->quantPortas = 4;
        $c1->velocidade = 200;
        $c1->chave = false;
        $c1->buzina = "funcionando";

        //metodos
        $c1->ligar();
        $c1->buzinar();
        $c1->voar();
    
?>