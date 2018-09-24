package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {           //В методе вводится и вычисляется сумма двух дробных чисел
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println("Введите второе число");
        float b = scanner.nextFloat();

        float x = a + b;
        System.out.println();
        System.out.printf("%s + %s = %.4f", a, b, x);
    }
}
