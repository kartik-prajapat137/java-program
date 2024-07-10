#include<stdio.h>
int main(){
    int n;
    printf("Enter the value of n is :");
    scanf("%d",&n);
    printf("\n");

    if(n>99 && n<1000){
        printf("The three digit value is : %d :",n);
        }else{
            printf("That is not three digit value %d:",n);

        }
        return 0;

}