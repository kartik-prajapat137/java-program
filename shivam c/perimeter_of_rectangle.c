#include<stdio.h>
//perimeter of rectangle
int main(){
    float side;
    float side2;
    printf("enter side");
    scanf("%f",&side);

    printf("enter side2");
    scanf("%f",&side2);

    printf("perimeter is:%f",2*(side+side2));
    return 0;

}