#include<stdio.h>
#include<conio.h>
#include<locale.h>

main(){
    setlocale(LC_ALL, "Portuguese");

	int num;
    int maiornum = 0;

    for(int x = 1; x <= 15; x++){
        printf("Digite um numero inteiro: ");
        scanf("%i",&num);

        if(num > maiornum){
            maiornum = num;
        }
    }

    printf("\nO maior numero digitado foi %i.", maiornum);
    
    getch();
}
