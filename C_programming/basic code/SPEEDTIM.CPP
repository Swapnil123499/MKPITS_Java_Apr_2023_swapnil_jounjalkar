#include<stdio.h>
#include<conio.h>
void main(){
    clrscr();
float speed,distance,time;
printf("the distance and time is ");
scanf("%f%f",&distance,&time);
speed=distance/time;
printf("the speed is %f",speed);
getch();
}
