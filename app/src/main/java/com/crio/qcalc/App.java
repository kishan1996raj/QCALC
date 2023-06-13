package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        StandardCalculator calc = new StandardCalculator();
        calc.add(5, 5);
        System.out.println(calc.getResult());
        calc.subtract(6, 2);
        System.out.println(calc.getResult());
        calc.clearResult();
        calc.printResult();

        double result = ScientificCalculator.cubeOf(4.0);
        System.out.println("cube = " + result);
        int result1 = ScientificCalculator.divide(15, 5);
        System.out.println(result1);
    }
}
