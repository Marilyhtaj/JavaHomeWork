package com.pb.lyhtaj.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumBox = new NumBox<>(3);
         try {
           floatNumBox.add(0,3.6F);
           floatNumBox.add(1,56.5F);
           floatNumBox.add(2,4.8F);
      //     floatNumBox.add(3,7.5F);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("В массиве закончилось место. Длина массива " + floatNumBox.length());
             // e.printStackTrace();
       }
        Float float1 = floatNumBox.get(0);
        Float float2 = floatNumBox.get(1);
        Float float3 = floatNumBox.get(2);

        System.out.println(float1.floatValue());
        System.out.println(float2.floatValue());
        System.out.println(float3.floatValue());

        System.out.println("Длина массива: " + floatNumBox.length());
        System.out.println("Максимальное число массива: " + floatNumBox.max());
        System.out.println("Среденее: " + floatNumBox.average());
        System.out.println("Сумма всех элементов массива: " + floatNumBox.sum());

        System.out.println("-------------------------------------------------");

        NumBox<Integer> integerNumBox = new NumBox<>(3);
        try {
            integerNumBox.add(0,5);
            integerNumBox.add(1,7);
            integerNumBox.add(2,100);
           // integerNumBox.add(3,200);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("В массиве закончилось место. Длина массива " + integerNumBox.length());
           // e.printStackTrace();
        }

        Integer integer1 = integerNumBox.get(0);
        Integer integer2 = integerNumBox.get(1);
        Integer integer3 = integerNumBox.get(2);

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
        System.out.println(integer3.intValue());

        System.out.println("Длина массива: " + integerNumBox.length());
        System.out.println("Максимальное число массива: " + integerNumBox.max());
        System.out.println("Среденее: " + integerNumBox.average());
        System.out.println("Сумма всех элементов массива: " + integerNumBox.sum());
   }
}
