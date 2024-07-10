/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

int main()
{

 
 int* ptr;
 int n, i;

 printf("Enter number of elements:");
 scanf("%d",&n);
 printf("Entered number of elements: %d\n", n);

 
 ptr = (int*)calloc(n ,sizeof(int));

 if (ptr == NULL) {
  printf("Memory not allocated.\n");
  exit(0);
 }
 else {

  printf("Memory successfully allocated using malloc.\n");

  for (i = 0; i < n; ++i) {
   ptr[i] = i + 1;
  }

  printf("The elements of the array are: ");
  for (i = 0; i < n; ++i) {
   printf("%d, ", ptr[i]);
  }
 }

 return 0;
}
