#include<stdio.h>
#include<conio.h>


int func()
{
int num1,num2,add;
printf("enter the numbers");
scanf("%d %d ", &num1,&num2);
add=num1+num2;
return add;
}

void main()
{
printf("%d",func());
getch();
}