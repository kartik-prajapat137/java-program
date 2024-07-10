#include<stdio.h>
int main(){
    int n;
    printf("Enter no = ");
    scanf("%d",&n);

    if(n%5==0 && n%3==0){
        printf("The no is divisible by 5 and 3 is = %d",n);
    }else{
        printf("The no is not divisible   by 5 and 3 = %d",n);
    }
    return 0;
}