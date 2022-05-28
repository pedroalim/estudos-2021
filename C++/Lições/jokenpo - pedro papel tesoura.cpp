#include<stdio.h>
#include<conio.h>

main(){
    int p1, p2;

    printf("1 jogador, escolha sua jogada");
    printf("\n[1] - Pedra\n[2] - Papel\n[3] - Tesoura");
    printf("\nDigite a sua escolha: ");
    scanf("%i",&p1);

    printf("2 jogador, escolha sua jogada");
    printf("\n[1] - Pedra\n[2] - Papel\n[3] - Tesoura");
    printf("\nDigite a sua escolha: ");
    scanf("%i",&p2);

    if(p1==p2){
        printf("O jogo deu empate.");
    }

    if(p1==1){
        if(p2==2){
            printf("O 2 jogador venceu!");          
        }
        else if(p2==3){
            printf("O 1 Jogador venceu!");
        }
    }
    else if(p1==2){
        if(p2==1){
            printf("O 1 Jogador venceu!");
        }
        else if(p2==3){
            printf("O 2 jogador venceu!");
        }
    }
    else if(p1==3){
        if(p2==1){
            printf("O 2 jogador venceu!");
        }
        else if(p2==2){
            printf("O 1 jogador venceu!");
        }
    }
    getch();
}