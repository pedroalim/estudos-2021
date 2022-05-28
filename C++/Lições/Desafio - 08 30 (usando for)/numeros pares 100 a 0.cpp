#include<conio.h>
#include<stdio.h>

main(){
    for(int x=100; x>=1; x--){
        if(x % 2 == 0){
        printf("%i\n", x);
        }
    }
    getch();
}