#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter the three si0des of traingle = ");
    scanf("%d%d%d",&a,&b,&c);

    if(a+b>c && b+c>a && c+a>b){
        printf("The traingle is vailid taingle");
    }else{
        printf("The taingle is invailid");
    }
    //return 0;
}