#include<stdio.h>
#include<conio.h>

main(){
    int num = 1;

    while(num <= 100){
        if(num % 2 == 0){
            printf("%i\n", num);
        }

        num++;
    }

    getch();
}