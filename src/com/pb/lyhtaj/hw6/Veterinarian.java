package com.pb.lyhtaj.hw6;

public class Veterinarian {

   public Veterinarian() {
   }
   public static void treatAnimal(Animal...animals)  {
      for (Animal animal : animals) {
         System.out.println("На прием к Ветеринару пришло животное, у которого");
         System.out.println("зона обитания: " + animal.getLocation());
         System.out.println("пища: " + animal.getFood());
         System.out.println("");
      }
   }

}
