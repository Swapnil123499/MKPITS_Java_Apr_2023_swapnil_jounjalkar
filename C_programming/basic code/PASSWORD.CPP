#include<stdio.h>
#include<conio.h>

void main(){
clrscr();
int num=1234,password;
printf("Enter Password");
scanf("%d",&password);
if(password==num){printf("Password correct");}
else{printf("Password incorrect");}
getch();
}