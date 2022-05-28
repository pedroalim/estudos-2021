#include<stdio.h>
#include<conio.h>
#include<locale.h>

main(){
    setlocale(LC_ALL, "Portuguese");

    for(int x=1; x<=150; x++){
        printf("%i\n", x);
        if(x%10==0){
            printf("%i MULTIPLO DE 10\n\n", x);
        }
    }

    getch();
}