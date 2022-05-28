#include <stdio.h>
#include <conio.h>

main(){
    int qtdBois;
    float pesoboi, somapeso = 0;

    printf("Quantos bois serao calculados? ");
    scanf("%i",&qtdBois);

    for(int x = 1; x<=qtdBois; x++){
        printf("Informe o peso do boi %i: ", x);
        scanf("%f",&pesoboi);

        somapeso = somapeso + pesoboi;
    }
    printf("-----------------------------------------------\n");
    printf("O peso total dos bois equivale a: %.2f Kg\n", somapeso);
    printf("-----------------------------------------------\n");
    printf("A media dos pesos equivale a: %.2f Kg", somapeso/qtdBois);


    getch();
}