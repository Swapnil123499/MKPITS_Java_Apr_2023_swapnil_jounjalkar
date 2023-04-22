#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num;
printf("Enter number that we have to print in three line:");
scanf("%d",&num);
for(int i=0;i<=10;i++){printf("%d",num);}
printf("\n");
for(int j=0;j<=10;j++){printf("%d",num);}
printf("\n");
for(int k=0;k<=10;k++){printf("%d",num);}
getch();
}