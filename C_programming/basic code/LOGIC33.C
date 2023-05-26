  #include<stdio.h>
   #include<conio.h>
   void main()
   {
   char num,sp,str;
   clrscr();

   for(num=7;num>=1;num--)
   {
   if(num%2==0)
   {
   num--;
   }

   for(sp=7;sp<=40-num;sp++)
   {
   printf(" ");
   }
   for(str=1;str<=num;str++)
   {
   printf(" *");
   }
   printf("\n");
   }
   getch();
   }