#include<stdio.h>
#include<conio.h>


void main(){
clrscr();
     float r,pa,sv;
     printf("enter the value of radi");
     scanf("%f",&r);
     pa=3.142;
     sv=4*pa*r*r*r/3;
     printf("Volume of sphere is %f",sv);
     getch();
     }