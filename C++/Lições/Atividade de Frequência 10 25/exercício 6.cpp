#include<stdio.h>
#include<conio.h>
#include<locale.h>

main(){
    setlocale(LC_ALL, "Portuguese");

    int nota;
    float totalnota = 0;

    for(int x=1; x<=10; x++){
        printf("Digite a %i nota: ", x);
        scanf("%i",&nota);

        if(nota>=0 && nota<=10){
            totalnota = totalnota + nota;
        }else{
            printf("NOTA INVALIDA!!\n");
        }
    }
    
    float media = totalnota/10;

    printf("\nA sua media de notas foi %.2f.\n", media);
    printf("\nNOTA = %i\nTOTALNOTA = %i", nota, totalnota);

    getch();
}