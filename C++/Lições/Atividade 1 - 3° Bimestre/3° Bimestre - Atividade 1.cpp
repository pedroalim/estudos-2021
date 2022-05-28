#include<stdio.h>
#include<conio.h>

main(){
    float divisao, mult;
    int num1, num2, soma, sub;

    printf("Digite o primeiro numero: ");
    scanf("%i",&num1);

    printf("Digite o segundo numero: ");
    scanf("%i",&num2);

    soma = num1 + num2;
    sub = num1 - num2;
    divisao = num1 / num2;
    mult = num1 * num2;

    printf("Soma: %i", soma);
    printf("\nSubtracao: %i", sub);
    printf("\nDivisao: %.2f", divisao);
    printf("\nMultiplicacao: %.2f", mult);

    getch();
}
