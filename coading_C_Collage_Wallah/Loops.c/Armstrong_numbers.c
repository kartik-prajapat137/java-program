#include<stdio.h>
int main(){
    int n,modulo,cube,sum ;
    printf("Enter a number = ");
    scanf("%d",&n);
    
    for(int i = 0; i<=n; i++){
        int new_i;
        new_i = i;
        sum = 0;
    while(new_i>0){
        
        modulo = new_i%10;
        cube =  modulo*modulo*modulo;
         new_i = new_i/10;
        sum = sum + cube;
    }
    if(i == sum){

    printf("%d. The Armstrong number is = %d\n",i,sum);
      }  else {
      continue;
      }
    }
    return 0;
}