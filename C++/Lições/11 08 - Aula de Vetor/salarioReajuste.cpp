#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define t 5

//nome , salário 5 pessoas
//qual a taxa reajuste em %
//exibir o nome e o novo salário

main(){
	char nome[t] [20];  // [quantas pessoas] - [tamanho]
	float salario[t], reajuste;
	
	
	for (int x=0; x <= 4; x++){
		printf("Digite o nome do funcionario %i :", x+1);
		fflush(stdin);		//receber caracteres
		gets(nome[x]);
		printf("Digite o salario do %s: ", nome[x]);
		scanf("%f", &salario[x]);
	}
	
	printf("Qual o valor do reajuste : ");
	scanf("%f", &reajuste);
	
	for (int x=0; x<=4; x++){
		printf("\nFuncionario %s", nome[x]);
		printf("\nSalario: %.2f ", salario[x] + (reajuste/100*salario[x])); 
	}
	
	getch();
} 



