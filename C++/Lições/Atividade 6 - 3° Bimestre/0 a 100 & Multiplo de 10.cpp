#include<stdio.h>
#include<conio.h>

main(){
    int num = 0;

    while(num <= 100){
        printf("%i\n", num);

        if(num != 0 && num % 10 == 0){
            printf("O numero %i e multiplo de 10.\n", num);
        }

        num++;
    }

    getch();
}