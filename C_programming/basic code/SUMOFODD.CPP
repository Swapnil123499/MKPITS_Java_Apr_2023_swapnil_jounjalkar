#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int sum,num1,num2,num3,num4,num5;
printf("Enter Five number");
scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
if(num1%2!=0){sum=num1;}
if(num2%2!=0){sum=sum+num2;}
if(num3%2!=0){sum=sum+num3;}
if(num4%2!=0){sum=sum+num4;}
if(num5%2!=0){sum=sum+num5;}
printf("sum of all odd number %d",sum);
getch();
}