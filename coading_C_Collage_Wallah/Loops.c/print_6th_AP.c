#include<stdio.h>
int main(){
    int i,n;
    printf("Enter a n no of terms = ");
    scanf("%d",&n);
    float a = 100;
    for(i=1; i<=n; i++){
        printf(" %d",a);
        a = a/2;
}
    return 0;
}