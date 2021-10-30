package com.pb.lyhtaj.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){

        s1 = s1.replaceAll("\\p{Punct}","").toLowerCase();
        s2 = s2.replaceAll("\\p{Punct}","").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i])
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner skan = new Scanner(System.in) ;
        System.out.println("Введите первое предложение: ");
        s1 = skan.nextLine();
        System.out.println("Введите второе предложение: ");
        s2 = skan.nextLine();

        if (isAnagram(s1,s2)) {
            System.out.println("Это анаграмма");
        }
            else {
            System.out.println("Это НЕ анаграмма");
        }

    }
}
