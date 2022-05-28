#include<stdio.h>
#include<conio.h>

main(){
	int num1, num2;
	int total = 0;
	
	printf("Digite um numero: ");
	scanf("%i",&num1);
	
	printf("Digite outro numero: ");
	scanf("%i",&num2);
	
	if(num1 > num2){
		for(int x = num2; x <= num1; x++){
			if(x % 2 != 0){
				printf("%i\n", x);
				total = total + 1;
			}
		}
	}else{
		for(int x = num1; x <= num2; x++){
			if(x % 2 != 0){
				printf("%i\n", x);
				total = total + 1;
			}
		}
	}
	printf("--------------------------------\n");
	printf("Existem %i numeros impares nesse periodo indicado.", total);
	
	getch(); 
}  
