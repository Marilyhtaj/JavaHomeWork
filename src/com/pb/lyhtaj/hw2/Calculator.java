package com.pb.lyhtaj.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите целое число 1: ");
        operand1 = skan.nextInt();
        System.out.print("Введите целое число 2: ");
        operand2 = skan.nextInt();
        System.out.print("Введите вычислительный знак: ");
        sign = skan.next();

        switch (sign) {
            case "+":
                System.out.println("Результат: " + (operand1+operand2) );
                break;
            case "-":
                System.out.print("Результат: " + (operand1-operand2) );
                break;
            case "*":
                System.out.print("Результат: " + (operand1*operand2) );
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Делить на 0 запрещено!");
                }
                else {
                    System.out.print("Результат: " + (operand1 / operand2));
                }
        }
    }
}
