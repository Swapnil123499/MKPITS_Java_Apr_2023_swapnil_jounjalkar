package org.example;





import org.example.inter.CalculateOperation;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Integer number1=12;
       // Integer number2=15;
        Scanner firstNumber = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number1=");

        Double number1 = firstNumber.nextDouble();
        System.out.println("Enter operator=");
        Scanner operator = new Scanner(System.in);
        String str = operator.nextLine();
        System.out.println("Enter number2=");
        Scanner secondNumber = new Scanner(System.in);
        Double number2 =  secondNumber.nextDouble();


 // String str="+";
        CalculateOperation calculate=new CalculateOperation();
        calculate.operationsOfNumber(number1,str,number2);


        }
}