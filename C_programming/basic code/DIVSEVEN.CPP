#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num1,num2;
printf("Enter Two number");
scanf("%d%d",&num1,&num2);
while(num1<=num2)
{
if((num1%7==2)||(num1%7==3))
{printf("%d\n",num1);}
num1=num1++;}
printf("done");
getch();
}
