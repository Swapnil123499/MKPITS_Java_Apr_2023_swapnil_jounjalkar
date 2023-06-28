package org.example.inter;


import org.example.inter.impl.Calculator;

public class CalculateOperation{

public void operationsOfNumber(Double number1,String str,Double number2){

    switch(str) {
        case "+":
            Calculator calculator=new Calculator();
            calculator.addTwoNumber(number1,number2);

            break;
        case "-":
            Calculator calculatorSubtraction=new Calculator();
            calculatorSubtraction.subtractTwoNumber(number1,number2);
            break;
        case "*":
            Calculator calculatorMultiplication=new Calculator();
            calculatorMultiplication.multiplicationTwoNumber(number1,number2);
            break;
        case "/":
            Calculator calculatorDivision=new Calculator();
            calculatorDivision.divisionTwoNumber(number1,number2);
            break;
    }
}
}
