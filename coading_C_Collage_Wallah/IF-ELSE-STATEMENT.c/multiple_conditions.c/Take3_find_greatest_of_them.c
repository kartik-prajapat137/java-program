#include<stdio.h>
int main(){
    int a,b,c;
    printf("Enter first A no = ");
    scanf("%d",&a);
    printf("Enter second B no = ");
    scanf("%d",&b);
    printf("Enter three C no = ");
    scanf("%d",&c);

    if(a>b && a>c){
        printf("\n A is greater than of 3 is = %d",a);
    }if(b>a && b>c){
        printf("\n B is greater than of 3 is = %d", b);
    }if(c>a && c>b){
        printf("\n C is greater than of 3 is = %d", c);
    }
    return 0;
}