#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int positive=0,negative=0,num1,num2,num3,num4,num5;
printf("Enter five number:");
scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
if(num1>0)
{positive=num1;}
else{negative=num1;}
if(num2>0){positive=positive+num2;}
else{negative=negative+num2;}
if(num3>0){positive=positive+num3;}
else{negative=negative+num3;}
if(num4>0){positive=positive+num4;}
else{negative=negative+num4;}
if(num5>0){positive=positive+num5;}
else{negative=negative+num5;}
printf("The negative number is %d\n",negative);
printf("The positive number is %d\n",positive);
getch();
}
