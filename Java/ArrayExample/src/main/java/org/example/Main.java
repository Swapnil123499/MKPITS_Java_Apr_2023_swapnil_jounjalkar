package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Arithmetic Expression of Sum of square of every 4th number of series =>");
        AbstractArrays arrays=new SquareArray();
        arrays.squareOfIndexFourth();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    System.out.println("Arithmetic Expression of sum of cube of 5th number of series");
    arrays.sumOfCubeOfEveryFifthElement();
    }
}