// an AP is 1 3 5 7 .......upto n terms find n term;//
#include<stdio.h>
int main(){
    int n;
    printf("Enter a no. of terms = ");
    scanf("%d",&n);
    int a=1;
    for(int i=1; i<=n; i++){
        printf("%d ",a);
        a = a+2;
    }
    return 0;
}
// #include<stdio.h>
// int main(){
//     int n;
//     printf("Enter a no. of terms = ");
//     scanf("%d",&n);

//     for(int i=1; i<=2*n-1; i+2){
//         printf("%d ",i);
//     }
//     return 0;
// }