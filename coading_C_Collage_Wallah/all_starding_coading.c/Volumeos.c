#include<stdio.h>
int main(){
   float r;
   
   //int r;
   
    printf("Enter the value of r is:");
    scanf("%f",&r);
   
    //scanf("%d",&r);
   
    float v = (4*3.14*r*r*r)/3;
    printf("The volume of sphere is: %f", v);

    return 0;
    
}