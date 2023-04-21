#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num;
printf("Enter the number of month from 1 to 12:");
scanf("%d",&num);
if(num==1)
{printf("JAN");
}
else if(num==2){printf("FEB");}
else if(num==3){printf("MARCH");}
else if(num==4){printf("APRIL");}
else if(num==5){printf("MAY");}
else if(num==6){printf("JUN");}
else if(num==7){printf("JULY");}
else if(num==8){printf("AUG");}
else if(num==9){printf("SUB");}
else if(num==10){printf("AUGT");}
else if(num==11){printf("NOV");}
else if(num==12){printf("DEC");}
else{
printf("Enter Wrong number,enter number from1 to 12");
}
getch();
}