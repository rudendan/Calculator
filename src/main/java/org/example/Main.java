package org.example;

public class Main {

    public static void main(String[] args) {

        if (args.length == 3)
            start(args);
        else
            System.out.println("Wrong number of arguments! There must be three arguments");
    }

    private static void start(String[] args) {
        try {

            int firstOperand = Integer.parseInt(args[0]);

            int secondOperand = Integer.parseInt(args[1]);

            char operator = args[2].charAt(0);

            Calculator calc = new Calculator(firstOperand, secondOperand);
            calc.operation(operator);

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
