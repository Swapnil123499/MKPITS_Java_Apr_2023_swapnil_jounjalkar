package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number1=12;
        // to create the object of the Integer is method are deprecates this methode known as a boxing
       // Integer number2= new Integer(number1);
        //the direct assign value in the Integer class (wrapper class) are known as a auto boxing
        Integer number2 = number1;
        // wrapper to primitive datatype;
        //the wrapper class convert into primitive datatype by using method are unboxing
        int number4=number2.intValue();
        //the wrapper class directly convert into primitive datatype are known as auto-unboxing
        int number3=number2;
        System.out.println(number2+""+number3+""+number4);
        String str="45";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
    }
}