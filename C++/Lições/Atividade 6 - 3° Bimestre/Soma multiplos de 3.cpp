#include<stdio.h>
#include<conio.h>

main(){
    int num = 1, soma = 0;

    while(num <= 100){
        if(num % 3 == 0){
            soma = soma + num;
        }

        num++;
    }

    printf("A soma total dos multiplos de 3 entre 1 e 100 foi %i.", soma);

    getch();
}