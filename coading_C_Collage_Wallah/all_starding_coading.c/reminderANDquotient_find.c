#include<stdio.h>
int main(){

    int a,b,q,r;
    int r2;

    printf("Enter the value of dividwend = ");
    scanf("%d",&a);

    printf("Enter the vlaue of divisor = ");
    scanf("%d",&b);

    q = a/b;
    r = a-b*q;
    r2 = a%b;

    printf("\nquoestient is %d\n",q);
    printf("reminder is = %d\n",r);
    printf("reminde 2 is = %d\n",r2);


    return 0;
}
#include<stdio.h>
int main(){
    
    
    float x;

    printf("Enter the value of x is:");
    scanf("%f",&x);
    printf("\n");

    int y = x;

    printf("The value of y is:%d",y);
    printf("\n");

    int z = x-y;
    printf("The value of decimal is:%f",z);

    return 0;

