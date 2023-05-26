#include<stdio.h>
#include<conio.h>
void  func(char ch)
{
char lowercase,uppercase,chara;
lowercase=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
uppercase=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
if(lowercase||uppercase)
{
printf("this is a vowel");
}
else
{
printf("this character is consonant");
}
}
void main()
{
char ch1;
printf("enter the charcter");
scanf("%c",&ch1);
func(ch1);
getch();
}