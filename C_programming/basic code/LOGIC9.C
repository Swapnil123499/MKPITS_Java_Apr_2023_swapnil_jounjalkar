
#include<stdio.h>
#include<conio.h>
void main()
{
int t,z;
clrscr();
for(t='A';t<='E';t++)
{
for(z='E';z>=t;z--)
{
printf("%c",t);
}
printf("\n");
}
getch();
}