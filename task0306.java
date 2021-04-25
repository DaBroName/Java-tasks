package com.company;

/*
Программа просчитывает возможность существования треугольника на основе длин его 3х сторон
Результат в виде констант
Для этого сравним каждую сторону с суммой двух других
 */

import java.util.Scanner;

public class task0306 {

    private static final String TRIANGLE_EXESTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXESTS = "треугольник не существует";

    public static void main(String[] args) {
        System.out.println("Введите три стороны треугольника");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону А");
        int a = scanner.nextInt();
        System.out.println("Введите сторону B");
        int b = scanner.nextInt();
        System.out.println("Введите сторону C");
        int c = scanner.nextInt();

        boolean b1 = (a < (b + c));
        boolean b2 = (b < (a + c));
        boolean b3 = (c < (a + c));

        if (b1 && b2 && b3)
            System.out.println(TRIANGLE_EXESTS);
        else
            System.out.println(TRIANGLE_NOT_EXESTS);
    }
}
