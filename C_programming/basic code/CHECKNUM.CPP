#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
long int num1,num2,mult;
printf("Enter two number:");
scanf("%ld%ld",&num1,&num2);
mult=num1*num2;
if((mult)<32767&&(mult)>(-32768))
{printf("number can multiple");
}
else
{printf("number can not multiply");}
getch();
}