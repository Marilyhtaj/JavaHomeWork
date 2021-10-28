package com.pb.lyhtaj.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String MyMethod() {
        Scanner skan = new Scanner(System.in);
        String x = skan.nextLine();
        char[] chArray = x.toCharArray();

        chArray[0] = Character.toUpperCase(chArray[0]);
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ' ') {
                chArray[i+1] = Character.toUpperCase(chArray[i+1]);
            }
        }
        x = new String(chArray);
       return x;
    }

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любую фразу");
        System.out.println(MyMethod());

    }
}