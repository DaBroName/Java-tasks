package com.company;

import java.util.Scanner;

public class task0304 {
    /*
    измерим температуру тела
     */

    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        double bodyTemperature = scanner.nextDouble();
        boolean isHigh = (bodyTemperature > 37);
        boolean isLow = (bodyTemperature < 36);
        if (isHigh)
            System.out.println("температура тела высокая");
        else if (isLow)
            System.out.println("температура тела низкая");
        else
            System.out.println("температура тела нормальная");
    }

}
