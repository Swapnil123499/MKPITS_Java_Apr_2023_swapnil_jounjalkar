#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
 float pi=3.142;
 float r;
 float Area;
printf("Find area of square?");
printf("Enter radius:");
scanf("%f",&r);
	 Area=pi*r*r;
printf("The area of circle is %f",Area);
getch();
}
