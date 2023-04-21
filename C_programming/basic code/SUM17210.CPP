#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num1,num2,sum;
printf("Enter two number");
scanf("%d%d",&num1,&num2);
while(num1<=num2)
{sum=num1;
num1=num1++;
}
if(sum%17!=0){printf("sum are not divisible by 17");}
getch();
}
