#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int perisum,side1,side2,side3;
printf("Enter side of tringle:");
scanf("%d%d%d",&side1,&side2,&side3);
if(side1>(side2+side3)&&side2>(side1+side3)&&side3>(side1+side2))
{printf("triangle is possible");
perisum=side1+side2+side3;
printf("perimeter of triangle is %d",perisum);
}
else{
printf("triangle not possible");}
getch();
}
