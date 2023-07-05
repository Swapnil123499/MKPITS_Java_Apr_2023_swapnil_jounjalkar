package org.example.abstrac;

public class AbstractImpl extends AbstractProgram{
    @Override
    public Long addTwoNumber(Long number1, Long number2) {
        System.out.println(number2+number1);
        return number2+number1;
    }

    @Override
   public Long substractTwoNumber(Long number1, Long number2) {
        System.out.println(number2-number1);
        return number2-number1;
    }

    @Override
   public Long multiplicationTwoNumber(Long number1, Long number2) {
        System.out.println(number2*number1);
        return number2*number1;
    }

    @Override
   public Long divisionTwoNumber(Long number1, Long number2) {
        System.out.println(number2/number1);
        return number2/number1;
    }

    @Override
    public Long areaOfCircle(Long radius) {
        System.out.println(4*radius*radius);
        return 4*radius*radius;
    }
}
