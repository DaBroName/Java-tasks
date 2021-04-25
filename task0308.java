package com.company;

import java.util.Scanner;

/*
Ввести с клавиатуры два целых числа, которые будут координатами точки (x и y)
Известно, что точка не лежит на координатных осях OX и OY
Вывести на экран номер координатной четверти, в которой находится данная точка

1 четверть - X>0 Y>0
2 четверть - X<0 Y>0
3 четверть - X<0 Y<0
4 четверть - X>0 Y<0
 */
public class task0308 {
    public static void main(String[] args) {
        System.out.println("Введите через Enter два числа");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х");
        int x = scanner.nextInt();
        System.out.println("Введите координату У");
        int y = scanner.nextInt();
        if ((x > 0) && (y > 0))
            System.out.println("1 четверь");
        else if ((x < 0) && (y > 0))
            System.out.println("2 четверь");
        else if ((x < 0) && (y < 0))
            System.out.println("3 четверь");
        else if ((x > 0) && (y < 0))
            System.out.println("4 четверь");
    }
}
