package com.company.algonds.java;

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class ExtensionMethods {
    public static void main(String[] arg) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(4));
    }
}
