#include<stdio.h>
int main(){

    int l,b;

                            //Area of rectangle is =L*B;//
                            //Perimeter of rectangle is = 2(L+B);\\

    printf("Enter the value of Length is:");
    scanf("%d",&l);
    printf("\n");

    printf("Enter the value of Breath is :");
    scanf("%d",&b);
    printf("\n");

    int lb = l*b;
    int bl = 2*(l+b);
    int T   = lb-bl;

    if(T>0){
        printf("The area of rectangle is greater than %d to perimeter of rectangle",T);
         }if(T<0){
            printf("The perimeter of rectaggle is greater than %d to area of rectangle",T);
         }if(T==0){
            printf("The area of rectangle is equal to perimeter of rectangle    :%d=%d",lb,bl);

        }  

         return 0;          

}