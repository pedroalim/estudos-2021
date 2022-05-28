#include<stdio.h>
#include<conio.h>

main(){
    int num = 0, soma = 0;

    while(num <= 50){
        printf("%i\n", num);

        soma = soma + num;
        num++;
    }

    printf("O total da soma foi %i", soma);

    getch();
}