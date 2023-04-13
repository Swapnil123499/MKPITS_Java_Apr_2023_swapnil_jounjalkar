#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int r,h;
float volume,pi;
pi=3.142;

printf("Enter value of radius,height");
scanf("%d%d",&r,&h);
volume=pi*r*h;
printf("volume of cylinder=%f",volume);
getch();
}