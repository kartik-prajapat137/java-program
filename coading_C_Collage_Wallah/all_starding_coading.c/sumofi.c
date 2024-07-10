#include<stdio.h>
int main(){
    int n;
    int sum=0;
    int sum2=0;
    printf("Enetr a no is = ");
    scanf("%d",&n);

    for(int i=0; i<=n; i++){
        sum= sum+i;
        int sum2 = n*(n+1)/2; 

        
    }
    printf("Total sum is = %d",sum);
    printf("\nTotal sum2 is = %d",sum2);
}