#include<stdio.h>
#include<conio.h>

int func(int num1,int num2)
{
int add;
add=num1+num2;
printf("%d",add);
return add;
}
void main()
{
func(6,8);
getch();
}