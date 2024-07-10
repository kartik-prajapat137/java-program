#include<stdio.h>
int main(){
int i;
printf("Printing 1 to 100 no. of counting\n");
    for(i=1; i<=100; i++){
        printf("%d ",i);
    }
    printf("\nPrinting 1 to 100 no. of even no.\n");

     for(i=1; i<=100; i++){
        if(i%2==0){
        printf("%d ",i);
        }}

       printf("\n Printing 1 to 100 no. of odd no. \n");

    for(i=1; i<=100; i++){
         if(i%2!=0){
            printf("%d ",i);
          }}
          
    return 0;  //
    }