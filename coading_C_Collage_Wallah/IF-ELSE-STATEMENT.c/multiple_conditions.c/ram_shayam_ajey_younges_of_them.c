#include<stdio.h>
int main(){
    int ram,shayam,ajey;
    printf("Enter age of Ram persion ");
    scanf("%d ",&ram);
    printf("Enter age of shayam persion ");
    scanf("%d ",&shayam);
    printf("Enter age of ajey persion ");
    scanf("%d ",&ajey);

    if(ram>shayam && ram>ajey){
        printf("\nRam is youngest of them = %d",ram);
    }if(shayam>ram && shayam>ajey){
        printf("\nShayam is youngest of them = %d",shayam);
    }if(ajey>ram && ajey>shayam){
        printf("\nAjey is youngest of them = %d",ajey);
    }
    return 0;
}