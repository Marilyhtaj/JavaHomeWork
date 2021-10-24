package com.pb.lyhtaj.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int[] array = new int[10];
        boolean isSorted = false;
        int xxx;
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");

        for (int i=0; i<array.length; i++) {
            System.out.println("Введите число:");
            array[i] = skan.nextInt();
        }

        System.out.println(Arrays.toString(array));

        //for (int i=0; i<array.length; i++) {
          //  sum = sum + array[i];
        //}

        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Сумма всех элементов массива = " + sum);

       // for (int i=0; i<array.length; i++) {
        //    if (array[i] > 0) {
        //        count++;
       //     }
       // }

        for (int i : array) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов массива = " + count);

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    xxx = array[i];
                    array[i] = array[i+1];
                    array[i+1] = xxx;
                }
            }
        }
        System.out.println("Отсортированный массив от меньшего к большему " + Arrays.toString(array));
    }

}
