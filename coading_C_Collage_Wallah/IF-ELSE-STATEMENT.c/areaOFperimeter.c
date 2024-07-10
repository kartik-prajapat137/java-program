#include<stdio.h>
int main(){

  int l,b;

  printf("enter the length is = ");
  scanf("%d",&l);

   printf("enter the breath is = ");
   scanf("%d",&b);

  int ar = l*b;

  int pr = 2*(l+b);

  int T = ar-pr;

  if(T>0){
    printf("area of rectangle is greater than pr is = %d", T);
  }if(T<0){
    printf("perimeter of rectangle is grester then ar is = %d",T);
  }if(ar==pr){
    printf("ar is equale to pr");
  }
  return 0;




  


}