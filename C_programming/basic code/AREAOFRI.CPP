#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int base,height;
float area;
printf("Enter Base and height of right angle triangle:");
scanf("%d%d",&base,&height);
area=0.5*base*height;
printf("Area of right angle triangle is %f",area);
getch();
}
