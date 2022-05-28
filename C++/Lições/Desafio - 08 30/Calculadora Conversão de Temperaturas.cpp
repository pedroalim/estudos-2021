#include<stdio.h>
#include<conio.h>

main(){

    int escolha;
    float C, F, K;

    printf("-----------------------------------------");
    printf("\nEscolha sua Conversao: ");
    printf("\n[1] - Celcius ---> Fahrenheit");
    printf("\n[2] - Fahrenheit ---> Celcius");

    printf("\n[3] - Celcius ---> Kelvin");
    printf("\n[4] - Kelvin ---> Celcius");

    printf("\n[5] - Kelvin ---> Fahrenheit");
    printf("\n[6] - Fahrenheit ---> Kelvin");
    printf("\n-----------------------------------------");
    printf("\nDigite a sua escolha: ");
    scanf("%i",&escolha);

    if(escolha==1){
        printf("Digite a temperatura em Celcius: ");
        scanf("%f",&C);

        F = (C * 1.8) + 32;

        printf("A temperatura %.1f C equivale a %.1f F.", C, F);
        printf("\n-----------------------------------------");
    }
    if(escolha==2){
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%f",&F);

        C = (F - 32)/ 1.8;

        printf("A temperatura %.1f F equivale a %.1f C.", F, C);
        printf("\n-----------------------------------------");
    }
    if(escolha==3){
        printf("Digite a temperatura em Celcius: ");
        scanf("%f",&C);

        K = C + 273;

        printf("A temperatura %.1f C equivale a %.1f K.", C, K);
        printf("\n-----------------------------------------");
    }
    if(escolha==4){
        printf("Digite a temperatura em Kelvin: ");
        scanf("%f",&K);

        C = K - 273;

        printf("A temperatura %.1f K equivale a %.1f C.", K, C);
        printf("\n-----------------------------------------");
    }
    if(escolha==5){
        printf("Digite a temperatura em Kelvin: ");
        scanf("%f",&K);

        F = ((K - 273) * 1.8) + 32;

        printf("A temperatura %.1f K equivale a %.1f F.", K, F);
        printf("\n-----------------------------------------");
    }
    if(escolha==6){
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%f",&F);

        K = ((F - 32) * 5/9) + 273;

        printf("A temperatura %.1f F equivale a %.1f K.", F, K);
        printf("\n-----------------------------------------");
    }
    getch();
}