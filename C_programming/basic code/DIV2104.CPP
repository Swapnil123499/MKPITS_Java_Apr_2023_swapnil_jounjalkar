#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num1,num2;
printf("Enter two number");
scanf("%d%d",&num1,&num2);
if(num1%num2!=0){printf("number not divisible");}
else{printf("number are divisible");}
getch();
}