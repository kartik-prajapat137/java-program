#include<stdio.h>
int main(){

    int n;
    printf("Enter the value of n is = ");
    scanf("%d",&n);

    if(n>90){
        printf("A gread is exellent = %d",n);
    }else if(n>80){
        printf("B gread is good= %d",n);
    }else if(n>70){
        printf("C gread is nice= %d",n);
    }else if(n>60){
        printf("D gread is well= %d",n);
    }else if(n>50){
        printf("E gread is OK= %d",n);
    }else if(n>40){
        printf("F gread is Not GooD = %d",n);
    }else{
        printf("failed = %d",n);
    }
     return 0;
}