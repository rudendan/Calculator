package org.example;

public class Calculator {

    private int firstOperand;
    private int secondOperand;

    public Calculator(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public void operation(char operator) {
        switch (operator) {
            case '+' -> System.out.println(add());

            case '-' -> System.out.println(sub());

            case 'x' -> System.out.println(multip());

            case '/' -> {
                if (secondOperand != 0)
                    System.out.println(div());
                else
                    System.out.println("Cannot divide a value by zero.");
            }
            default -> System.out.println("Wrong operation!");
        }
    }

    private int add() {
        return firstOperand + secondOperand;
    }

    private int sub() {
        return firstOperand - secondOperand;
    }

    private int multip() {
        return firstOperand * secondOperand;
    }

    private int div() {
        return firstOperand / secondOperand;
    }
}
