#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int count=0,num1,num2,num3,num4,num5,positive=0;
float avg;
printf("Enter the five number:");
scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
if(num1>0){positive=num1;count=count++;}
if(num2>0){positive=positive+num2;count=count++;}
if(num3>0){positive=positive+num3;count=count++;}
if(num4>0){positive=positive+num4;count=count++;}
if(num5>0){positive=positive+num5;count=count++;}
	avg=positive/count;
	printf("the avg of positive number is : %f",avg);
	getch();
	}