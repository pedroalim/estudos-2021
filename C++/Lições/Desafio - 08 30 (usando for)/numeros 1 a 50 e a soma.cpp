#include<conio.h>
#include<stdio.h>

main(){
    int soma=0;

    for(int x=0; x<=50; x++){
        printf("%i\n", x);
        soma = soma + x;
    }
    printf("Soma dos valores = %i", soma);

    getch();
}