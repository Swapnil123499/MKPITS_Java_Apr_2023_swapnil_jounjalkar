package org.example;

//This are extended class of the AbstractArrays name of class is squareArray
public class SquareArray extends AbstractArrays{
    /*This are the @Override method of square of index fourth*/
    @Override
    public void squareOfIndexFourth() {
        int sum=0;
        int numbers[]={4,5,6,4,8,9,6,8,5,56,52,45,58,52,56,58,85,89,89,9,8,5,5,4,5,6,4,8,9,6,8,5,56,52,45,58,52,56,58,85,89,89,9};
        for(int number=1;number<numbers.length;number++){
            if(number%4==3){

               sum= ((numbers[number]*numbers[number])+sum);
             System.out.print((numbers[number])+"*"+numbers[number]+"+");
            }


        }
        System.out.print("0=>"+sum);
    }
  /*this are override method of sum of cube of every fifth elements*/
    @Override
    public void sumOfCubeOfEveryFifthElement() {
        int sum=0;
        int sign=0;
        int numbers[]={4,5,6,4,8,9,6,8,5,56,52,45,58,52,56,58,85,89,89,9,8,5,5,4,5,6,4,8,9,6,8,5,56,52,45,58,52,56,58,85,89,89,9};
        for(int number=1;number<numbers.length;number++){
            if(number%4==0){
            if(sign%2!=0) {
                sum = ((numbers[number] * numbers[number] * numbers[number]) + sum);
                System.out.print((numbers[number]) + "*" + numbers[number] + "*" + numbers[number] + "-");
            }
            else {
                sum = (sum-(numbers[number] * numbers[number] * numbers[number]) );
                System.out.print((numbers[number]) + "*" + numbers[number] + "*" + numbers[number] + "+");
            }
            sign++;
            }


        }
        System.out.print("0=>"+sum);
    }
}
