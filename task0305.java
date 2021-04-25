package com.company;
/*
три числа
 */

/*
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара есть, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Если нет равных чисел, ничего не выводить.

Пример
1. при вводе чисел 1 2 2 получим вывод 2 2
2. при вводе чисел 2 2 2 получим вывод 2 2 2
 */


import java.util.Scanner;

public class task0305 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа (через Enter)");
        Scanner number = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = number.nextInt();
        System.out.println("Введите второе число");
        int b = number.nextInt();
        System.out.println("Введите третье число");
        int c = number.nextInt();


    }
}
