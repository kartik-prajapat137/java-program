#include<stdio.h>
int main(){
    int a,b,c;
    printf("Enter first A no = ");
    scanf("%d",&a);
    printf("Enter second B no = ");
    scanf("%d",&b);
    printf("Enter three C no = ");
    scanf("%d",&c);

    if(a>b){
        if(a>c){
            printf("The a is greatest of them = %d",a);
        }
        else{
            printf("THE c is greast of them = %d",c);
        }
    }else{
        if(b>c){
            printf("The b is greatest of them = %d",b);
        }else{
            printf("The c is greatest of them = %d",c);
        }
    }

    return 0;
    }
