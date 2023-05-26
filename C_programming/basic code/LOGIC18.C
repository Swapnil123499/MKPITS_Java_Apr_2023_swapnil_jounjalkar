#include<stdio.h>
#include<conio.h>
void main()
{
int num1;
char c;
clrscr();
for (num1='E';num1>='A';num1--)
{
 for(c=1;c<=5;c++)
 {
 printf("%c",num1);
}
printf("\n");
}
getch();
}
