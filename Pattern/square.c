#include<stdio.h>
int main(){
    int n;
    printf("Enter he number ; ");
    scanf("%d", &n);
    int i, j;
    for(i=1; i<=n;i++){
        for(j=1; j<=n;j++){
            printf("%d ", i);
        }
        printf("\n");
    }
}