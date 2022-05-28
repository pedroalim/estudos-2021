#include<stdio.h>
#include<conio.h>

main(){
	
	// (num%2 == 0)
    // (num%2 != 0)
	
	int num1, num2;
	
	printf("Digite um numero: ");
	scanf("%i",&num1);
	
	printf("Digite outro numero: ");
	scanf("%i",&num2); 
	
	if(num1 > num2){
		for(int x = num1; x >= num2; x--){
			if(x % 2 != 0){
				printf("%i\n", x);	
			}
		}
	}else if(num1 < num2){
		for(int x = num2; x >= num1; x--){
			if(x % 2 != 0){
				printf("%i\n", x);
			}
		}
	}
	
	getch();
}
