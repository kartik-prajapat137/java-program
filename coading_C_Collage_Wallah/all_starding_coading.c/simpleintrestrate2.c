#include<stdio.h>
int main(){
    float principal, rate, time, si, t;

    printf("Enter principal is =");
    scanf("%f",& principal);

    printf("Enter rete of principal is =");
    scanf("%f",&rate);

    printf("Enter time of principal is =");
    scanf("%f",&time);

    si = (principal*rate*time)/100;

    t = si+principal;

    printf("\nThe simple intrest  is = %f\n\n",si);

    printf("total principal is = %f \n", t);







    return 0;
}