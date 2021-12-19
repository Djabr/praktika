package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a,b,c,d,x1,x2,x;
        System.out.print("Введите значение a: ");
        a = num.nextDouble();

        System.out.print("Введите значение b: ");
        b = num.nextDouble();

        System.out.print("Введите значение c: ");
        c = num.nextDouble();
        d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
