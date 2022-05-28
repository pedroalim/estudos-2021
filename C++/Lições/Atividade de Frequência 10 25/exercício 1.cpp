#include<stdio.h>
#include<conio.h>
#include<locale.h>

main(){
	setlocale(LC_ALL,"portuguese");
	
	for(int x = 111; x <= 2500; x++){
		if(x %2 == 0){
			printf("%i\n", x);
		}
	}
	
	getch();
}
