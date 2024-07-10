#include<stdio.h>
int main(){
    int n;
    printf("Enter a number = ");
    scanf("%d",&n);

    (n%2==0 )? printf("The even number is = %d",n): printf("The odd number is = %d",n); 
} 