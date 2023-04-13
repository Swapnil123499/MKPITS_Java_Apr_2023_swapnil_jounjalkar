#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int r,h;
float pa,volume,pa2;
pa=3.142;
pa2=0.334;
printf("enter the radius,height");
scanf("%d%d",&r,&h);
  volume=pa*r*r*h*pa2;
  printf("volume ofcone:%f",volume);
  getch();
  }