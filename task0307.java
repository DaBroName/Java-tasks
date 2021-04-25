package com.company;

/*
Считываем с клавиатуры возраст. Если возраст от 20 до 60 включительно, то ничего не выовдим.
Иначе - вывести фразу "можно не работать"
Нужно исп. только оператор if без else
(исп. оператор ИЛИ ||)
 */

import java.util.Scanner;

public class task0307 {
    public static void main(String[] args) {
        System.out.println("Введите возраст");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if ((age < 20) || (age > 60))
            System.out.println("можно не работать");
    }
}
