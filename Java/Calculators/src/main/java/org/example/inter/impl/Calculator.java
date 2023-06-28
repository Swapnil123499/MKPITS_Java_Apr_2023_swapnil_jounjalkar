package org.example.inter.impl;



public class Calculator  {

    public Double addTwoNumber(double number1, double number2) {
        Double sum=number1+number2;
        System.out.println("The addition of "+number1+" and "+number2+" :"+sum);
        return sum;
    }


    public Double subtractTwoNumber(double number1, double number2) {
        Double subtract=number1-number2;
        System.out.println("The subtract of "+number1+" and "+number2+" :"+subtract);
        return subtract;
    }


    public Double multiplicationTwoNumber(double number1, double number2) {
        Double multiplication=number1*number2;
        System.out.println("The multiplication of "+number1+" and "+number2+" :"+multiplication);
        return multiplication;
    }


    public Double divisionTwoNumber(double number1, double number2) {
        Double division=number1/number2;
        System.out.println("The division of "+number1+" and "+number2+" :"+division);
        return division;
    }
}
