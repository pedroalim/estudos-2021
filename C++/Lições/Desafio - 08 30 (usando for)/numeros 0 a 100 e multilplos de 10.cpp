#include<conio.h>
#include<stdio.h>

main(){
    for(int x=0; x<=100; x++){
        if(x % 10 == 0){
            printf("O numero %i e multiplo de 10\n", x);
        }else{
            printf("%i\n", x);
        }
    }
    getch();
}