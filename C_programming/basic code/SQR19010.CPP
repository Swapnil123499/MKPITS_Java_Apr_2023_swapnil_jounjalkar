#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int sqr,num;
printf("Enter the value:");
scanf("%d",&num);

for(int i=0;i<=num;i++){
if(i%2!=0){sqr=i*i;
printf("%d\n",sqr);}
}
getch();
}