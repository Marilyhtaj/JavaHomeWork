package com.pb.lyhtaj.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Угадайте задуманное число в интервале чисел от 1 до 100 ");
        System.out.println("Если введете число, не входящее в интервал от 1 до 100 , будет завершение игры ");

        int x = random.nextInt( 100);
        int y;
        int count = 0;
        Scanner skan = new Scanner(System.in);

        while (true) {
            count++;
            System.out.println("Попытка №" + count + ":");
            y = skan.nextInt();

            if ((y < 0)|(y > 100)) {
                break;
            }
            if (y != x) {
                if (x > y)
                {
                    System.out.println("Задуманное число больше вводимого числа. ");
                } else
                {
                    System.out.println("Задуманное число меньше вводимого числа. ");
                }
                continue;
            }

            System.out.print("Поздравляем!Вы угадали c " + count + " попытки! " );
            break;
        }
            System.out.print("Конец игры!");
    }
}
