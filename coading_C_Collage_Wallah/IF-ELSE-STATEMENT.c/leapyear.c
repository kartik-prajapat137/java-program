#include<stdio.h>
int main(){

     int n;
     printf("Enter the year = ");
     scanf("%d",&n);

    if(n%4 == 0){
        printf("This  leap year is = %d,",n);
    }else{
        printf("This year is not leap = %d",n);
    }
    return 0;
}
