#include<stdio.h>
int main(){
    int n;

    printf("Enter the value of n");
    scanf("%d",&n);

    if(n%2==0){
        printf("%d is an even number",n);
    }if (n%2!=0){
         printf("%d is an odd num+ber",n);

    } 
    
    
    return 0;
     
 
}