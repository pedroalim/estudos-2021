#include<conio.h>
#include<stdio.h>

main(){
    int sexo, idade; 
    float totalmulher = 0, somaMulher = 0; 
    float totalhomem = 0, somaHomem = 0;

    for(int x = 1; x <= 10; x++){
        printf("----------------------------------------------------\n");
        printf("Homem - [1]\nMulher - [2]\nDigite o sexo da pessoa: ");
        scanf("%i",&sexo);

        printf("Digite a sua idade: ");
        scanf("%i",&idade);

        if(sexo==1){
            totalhomem += 1;
            somaHomem = somaHomem + idade;
        }else if(sexo==2){
            totalmulher += 1;
            somaMulher = somaMulher + idade;
        }
    }
    printf("----------------------------------------------------\n");
    printf("Mulheres: %.0f\nHomens: %.0f\n", totalmulher, totalhomem);
    printf("Soma da idade dos homens: %.0f\n", somaHomem);
    printf("Media da idade das mulheres: %.1f\n", somaMulher/totalmulher);

    getch();
}