#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int num1,num2;
printf("Enter two number:");
scanf("%d%d",&num1,&num2);
if(num1>num2)
{printf("number are in decending order");
}
else if(num1<num2){printf("number in ascending order");}
else{printf("number are equal");}
getch();
}
