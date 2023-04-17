#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
long int n,n1,n2,n3,n4,n5,sum;
printf("Enter the five digit number is ");
scanf("%ld",&n);
n1=n%10;
n=n/10;
n2=n%10;
n=n/10;
n3=n%10;
n=n/10;
n4=n%10;
n=n/10;
n5=n%10;

  sum=n1+n2+n3+n4+n5;
  printf("sum of all five num is %ld",sum);

  getch();
  }
