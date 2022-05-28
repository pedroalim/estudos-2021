#include<conio.h>
#include<stdio.h>

main(){
    for(int x=1; x<=100; x++){
        if(x % 3 == 0){
        printf("%i\n", x);
        }
    }
    getch();
}