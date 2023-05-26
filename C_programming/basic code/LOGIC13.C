#include<stdio.h>
#include<conio.h>
void main()
{
int a,t;
clrscr();

for(a=5;a>=1;a--)
{
for(t=1;t<=a;t++)
{
printf("%d",t);
}
printf("\n");
}
getch();
}