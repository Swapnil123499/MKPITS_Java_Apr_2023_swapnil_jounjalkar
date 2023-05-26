
#include<stdio.h>
#include<conio.h>
void main()
{
int num;
char c;
clrscr();
for(num='A';num<='E';num++)
{
for(c=1;c<=5;c++)
{
printf("%c",num);
}
printf("\n");
}
getch();
}