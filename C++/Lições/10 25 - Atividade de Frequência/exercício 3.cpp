#include<stdio.h>
#include<conio.h>

main(){
	int num;
	
	printf("Digite um numero: ");
	scanf("%i",&num);
	
	printf("-------------\n");
	for(int x = 1; x <= 10; x++){
		int resultado = x*num;
		
		printf(" %i x %i = %i\n", num, x, resultado);
	}
	printf("-------------\n");
	
	getch();
}
