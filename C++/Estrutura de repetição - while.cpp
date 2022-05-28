#include<stdio.h>
#include<conio.h>

main(){
    int num = 0, soma = 0;

    while(num <= 20){
        printf("%i\n", num);

        if(num % 10 == 0){
            printf("Numero multiplo de 10 achado. \n");
        }

        soma = soma + num;
        num++;  //  num += 1;  // num = num + 1;
    }
    printf("Soma dos valores = %i", soma);

    getch();
}