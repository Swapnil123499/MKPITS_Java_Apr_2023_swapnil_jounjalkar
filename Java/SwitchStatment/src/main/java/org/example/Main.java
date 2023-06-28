package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Float example is followed !!");
        float number =3.0f;
        switch(number){
            case 3.00f:
                System.out.println("3.00f");
                break;
            case 3.0f:
                System.out.println("3.0f");
                break;
            case 3.000f:
                System.out.println("3.00f");
            case 3.0000f:
                System.out.println("3.0000f");
                break;
            case 3.00000f:
                System.out.println("3.00000f");
                break;
            default:
                System.out.println("All cases are not running:");
        }

    }
}