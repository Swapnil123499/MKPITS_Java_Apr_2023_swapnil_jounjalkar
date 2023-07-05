package org.example;

import org.example.abstrac.AbstractImpl;


import org.example.abstrac.Animal;
import org.example.abstrac.Dog;
import org.example.abstrac.Tiger;
import org.example.inter.ProgramImpliment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interface result!");
        ProgramImpliment impl=new ProgramImpliment();
        impl.addTwoNumber(4l,5l);
        impl.substractTwoNumber(4l,5l);
        impl.multiplicationTwoNumber(4l,5l);
        impl.divisionTwoNumber(4l,8l);
        impl.areaOfCircle(4l);
        System.out.println("Abstract result");

        AbstractImpl impl1=new AbstractImpl();
        impl1.addTwoNumber(4l,5l);
        impl1.substractTwoNumber(4l,5l);
        impl1.multiplicationTwoNumber(4l,5l);
        impl1.divisionTwoNumber(4l,8l);
        impl1.areaOfCircle(4l);
        System.out.println("animal dog example:");
        Animal animal=new Tiger();

        animal.eatFood();
        Animal anima=new Dog();
        anima.eatFood();


    }
}