#include<stdio.h>
#include<conio.h>
void main()
{
int q,w;
clrscr();
for (q='A';q<='E';q++)
{
for(w='E';w>=q;w--)
{
printf("%c",q);
}
printf("\n");
}
getch();
}