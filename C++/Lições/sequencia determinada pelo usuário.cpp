#include<stdio.h>
#include<conio.h>

main(){
    int num1, num2;

    printf("Informe um valor: ");
    scanf("%i",&num1);

    printf("Informe um outro valor: ");
    scanf("%i",&num2);

    if(num1<num2){
        for(int x=num1;x<=num2;x++){
            printf("%i\n", x);
        }
    }else{
        for(int x=num2;x<=num1;x++){
            printf("%i\n", x);
        }
    }
    getch();
}