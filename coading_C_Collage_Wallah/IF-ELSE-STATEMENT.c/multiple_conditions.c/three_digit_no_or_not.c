#include<stdio.h>
int main()
{
    int n;
    printf("Enter the no. = ");
    scanf("%d",&n);

    if(n>99 && n<1000){
        printf("This is three digit no.= %d",n);
    }else{
        printf("This is not three digit no = %d", n);
    }
return 0;

}