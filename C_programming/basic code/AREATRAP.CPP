#include<stdio.h>
#include<conio.h>
void main(){
int a,b,height,sum;
float area;
printf("sum of parallel side :");
scanf("%d%d",&a,&b);
sum=a+b;
printf("for area of trapazoid enter height:");
scanf("%d",&height);
area=0.5*sum*height;
printf("area of trapazoid is %f",area);
getch();
}