package com.pb.lyhtaj.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumBox = new NumBox<>(3);
//       try {
           floatNumBox.add(0,3.6F);
           floatNumBox.add(1,56.5F);
           floatNumBox.add(2,4.8F);
//       }catch (ArrayIndexOutOfBoundsException e){
//           System.out.println("В массиве закончилось место. Длина массива " + floatNumBox.length());
//           e.printStackTrace();
//       }
       //floatNumBox.get(3);
       floatNumBox.length();
       floatNumBox.max();
       floatNumBox.average();
       floatNumBox.sum();

   }
}
