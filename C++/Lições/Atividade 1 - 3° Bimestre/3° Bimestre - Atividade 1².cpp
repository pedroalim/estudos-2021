#include<stdio.h>
#include<conio.h>

main(){
    float km, litro, media;

    printf("Informe a distancia em kilometros(km) percorrida: ");
    scanf("%f",&km);

    printf("Informe a quantidade de litros de combustivel gastos: ");
    scanf("%f",&litro);

    media = km / litro;

    printf("O consumo medio de combustivel foi de %.2f Km/L", media);

    getch();
}