#include<stdio.h>
#include<conio.h>
#include<locale.h>

main(){
    setlocale(LC_ALL, "Portuguese");

    int num, fat;

    printf("Digite um numero para calcular seu fatorial: ");
    scanf("%i",&num);

    for(fat=1; num>1; num = num - 1){
        fat = fat * num;

        printf("%i\n", fat);
    }
    printf("\nO fatorial foi calculado: %i", fat);

    getch();
}