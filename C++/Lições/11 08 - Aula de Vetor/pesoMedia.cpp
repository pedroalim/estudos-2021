#include <stdio.h>
#include <conio.h>
//peso de 10 pessoas, media dos pesos
//vetor[]

main(){
	
	float media, somaPeso=0;
	float peso[10];

	for (int x=0; x < 10; x++){
		printf("Informa o peso da pessoa %i: ", x+1);
		scanf("%f", &peso[x]);
			
		somaPeso = peso[x] + somaPeso;
	}
	
	media = somaPeso / 10;
	printf("--A media dos pesos = %.2f", media);

	for (int x=0; x < 10; x++) {
		printf("\nPeso pessoa %i = %.2f", x+1, peso[x]);
	}
	
	getch();
}

