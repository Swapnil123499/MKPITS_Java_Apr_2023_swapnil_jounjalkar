#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int L,B,H;
int volume;
printf("Enter the length breath and height cuboid:");
scanf("%d%d%d",&L,&B,&H);
volume=L*B*H;
printf("Volume of cuboid =%d",volume);

getch();
}
