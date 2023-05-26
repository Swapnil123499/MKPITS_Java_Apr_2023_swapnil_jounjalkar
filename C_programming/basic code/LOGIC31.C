  #include<stdio.h>
   #include<conio.h>
   void main()
   {
   char num,sp,str;
   clrscr();

   for(num=65;num<=71;num++)
   {
   if(num%2==0)
   {
   num++;
   }
   for(sp=1;sp<=78-num;sp++)
   {
   printf(" ");
   }
   for(str='A';str<=num;str++)
   {
   printf(" %c",str);
   }
   printf("\n");
   }
   getch();
   }