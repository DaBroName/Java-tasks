package com.company;

/*
программа считывает две строки с клавиатуры и выдает сообщение - одинаковые строки или нет
 */

import java.util.Scanner;

public class task0312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите две строки через Enter");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        boolean bool = str1.equals(str2);

        if (bool)
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
