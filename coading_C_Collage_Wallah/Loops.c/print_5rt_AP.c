// #include<stdio.h>
// int main(){
//     int i;
//     int a=100;
//     for(i=1; a>=0; i++){
//         printf("%d ",a);
//         a = a-3;
//     }
//     return 0;
// }
#include<stdio.h>
int main(){
    int i,n;
    printf("Enter a n no of terms = ");
    scanf("%d",&n);
    int a=100;
    for(i=1; i<=n; i++){
        printf(" %d",a);
        a = a-3;
}
    return 0;
}