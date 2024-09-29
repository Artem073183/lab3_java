package com.chmnu_ki_123.c3;

import static java.lang.Math.*;

public class MathCalc {
    public static void main(String[] args) {
        double x = -3, a = 2, b = -1, c = 5.1;

        double expAxB = exp(a * x - b);
        double log10AbsXC = log10(abs(x - c));

        double result = expAxB / log10AbsXC;

        System.out.printf("Result: %.5f\n", result);
    }
}