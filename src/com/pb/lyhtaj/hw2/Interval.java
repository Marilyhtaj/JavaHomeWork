package com.pb.lyhtaj.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int x;

        System.out.print("Введите целое число: ");
        x = skan.nextInt();

        if (x >=0 && x <= 14)
        {
            System.out.print("Число попало в промежуток [0 -14] ");
        }
        else if (x >=15 && x <= 35)
        {
            System.out.print("Число попало в промежуток [15 - 35] ");
        }
        else if (x >=36 && x <= 50)
        {
            System.out.print("Число попало в промежуток [36 - 50] ");
        }
        else if (x >=51 && x <= 100)
        {
            System.out.print("Число попало в промежуток [51 - 100] ");
        }
        else {
            System.out.print("Число не попало в указанные промежутки [0 -14],[15 - 35],[36 - 50],[51 - 100]");
        }
    }
}
