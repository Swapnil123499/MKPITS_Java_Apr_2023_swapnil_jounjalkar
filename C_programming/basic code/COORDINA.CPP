#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int x,y;
printf("Enter two number");
scanf("%d%d",&x,&y);
if(x>0&&y>0){printf("coordinates in firt quadrant");}
else if(x<0&&y>0){printf("coordinates in second quadrant");}
else if(x<0&&y<0){printf("coordinates in third quadrant");}
else if(x>0&&y<0){printf("coordinate in fourth quadrant");}
else{printf("coordinate on x or y axis");}
getch();
}