package com.example.calculatrice;

public class Calculatrice {

    public double add(double first, double second) {
        return first + second;
    }
    public double soustraire(double first, double second) {
        return first - second;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return dividend / divisor;
    }
}
