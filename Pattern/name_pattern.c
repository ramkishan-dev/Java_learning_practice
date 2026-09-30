//your sinple task, draw pattern your first letter of your name..
#include<stdio.h>
int main (){
	int i,j; //declare variable
	for(i=1; i<=6; i++){ //outer loop
		printf("*");
		if(i==2){
			for(j=1; j<2; j++)
			if(i==2)
			printf(" ");
			printf("*");
		} //if condition closed
		if(i==1){
			for(j=1; j<3; j++)
			printf("*");
		} //if closed
		if(i==3){
			for(j=1; j<3; j++)
			printf("*");
		} //if closed 
		if(i==4){
			for(j=1; j<4; j++)
			if(j==1){
			printf("*");
		} else printf(" ");
		} //if closed
		if(i==5){
			for(j=1; j<5; j++)
			if(j==2){
			printf("*");
		} else printf(" ");
		} //closed
		if(i==6){
			for(j=1; j<6; j++)
			if(j==3){
			printf("*");
		} else printf(" ");
		} //if closed
			printf("\n");
	} // outer loop colsed
}