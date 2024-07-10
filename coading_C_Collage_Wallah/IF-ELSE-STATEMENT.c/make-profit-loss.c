#include<stdio.h>
int main(){
    int cp, sp;

    printf("Enter value of cost price of = ");
    scanf("%d",&cp);

    printf("Enter value of selling price =");
    scanf("%d",&sp);

    if(sp>cp){
        int p = sp-cp;
        printf("make profit is =%d\n",p);
    }else if(cp>sp){
        int k = cp-sp;
        printf("Make net loss is =%d\n",k);
    }else {
        printf("Make No Loss No Profit %d=%d=0",cp,sp);
    }
    
    return 0;

}