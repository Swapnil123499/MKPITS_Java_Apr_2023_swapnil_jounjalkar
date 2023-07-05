package org.example.inter;

public class ProgramImpliment implements Programs{
    @Override
    public Long addTwoNumber(Long number1, Long number2) {
        Long add=number2+number1;
        System.out.println(add);
        return add;
    }

    @Override
    public Long substractTwoNumber(Long number1, Long number2) {
        Long sub=number2-number1;
        System.out.println(sub);
        return sub;
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
