#include<stdio.h>
#include<conio.h>

main(){

    /* 
    l - lado
    h - altura
    r - raio
    b - base
    baseMa - base maior
    baseMe - base menor
    */

    int escolha;
    float l, b, h, r, baseMa, baseMe;
    float pi = 3.14;

    printf("----------------------------------------------------");
    printf("\nEscolha uma forma geometrica para calcular sua area:");
    printf("\n----------------------------------------------------");
    printf("\n[1] - Quadrado");
    printf("\n[2] - Triangulo");
    printf("\n[3] - Circulo");
    printf("\n[4] - Paralelograma");
    printf("\n[5] - Trapezio");
    printf("\n----------------------------------------------------");
    printf("\nDigite a sua escolha: ");
    scanf("%i",&escolha);

    if(escolha==1){ /* Quadrado */
        printf("Digite o valor do lado do quadrado: ");
        scanf("%f",&l);

        float area = l * l;

        printf("A area desse quadrado corresponde a %.2f", area);
        printf("\n----------------------------------------------------");
    }else if(escolha==2){ /* Triângulo */
        printf("Digite o valor da base: ");
        scanf("%f",&b);
        printf("Digite o valor da altura: ");
        scanf("%f",&h);

        float area = (b * h)/ 2;

        printf("A area desse triangulo corresponde a %.2f", area);
        printf("\n----------------------------------------------------");
    }else if(escolha==3){ /* Circulo */
        printf("Digite o valor do raio do circulo: ");
        scanf("%f",&r);

        float area = pi * (r * r);

        printf("A area desse circulo corresponde a %.2f", area);
        printf("\n----------------------------------------------------");
    }else if(escolha==4){ /* Paralelograma */
        printf("Digite o valor da base: ");
        scanf("%f",&b);
        printf("Digite o valor da altura: ");
        scanf("%f",&h);

        float area = b * h;

        printf("A area desse paralelograma corresponde a %.2f", area);
        printf("\n----------------------------------------------------");
    }else if(escolha==5){ /* Trapézio */
        printf("Digite o valor da base maior: ");
        scanf("%f", baseMa);
        printf("Digite o valor da base menor: ");
        scanf("%f", baseMe);
        printf("Digite o valor da altura: ");
        scanf("%f",&h);

        float area = ((baseMa + baseMe)/2) * h;

        printf("A area desse trapezio corresponde a %.2f", area);
        printf("\n----------------------------------------------------");
    }else{
        printf("\nOpcao invalida!");
    }

    getch();
}
