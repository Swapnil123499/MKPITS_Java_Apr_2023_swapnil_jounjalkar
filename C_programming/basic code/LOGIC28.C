#include<stdio.h>


#include<conio.h>
char func(char ch)
{
char lowercase,uppercase,chara;
lowercase=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
uppercase=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
if(lowercase||uppercase)
{
printf("this is a vowel");
chara=lowercase;
chara=uppercase;
}
else
{
printf("this character is consonant");
}
return chara;
}

void main()
{
char ch1;
printf("enter the charcter");
scanf("%c",&ch1);
printf("%c",func(ch1));
getch();
}