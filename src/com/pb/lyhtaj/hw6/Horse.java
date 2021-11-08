package com.pb.lyhtaj.hw6;

public class Horse extends Animal {

      private String name;
      private String color;

      public Horse(String food, String location, String name, String color) {
            super(food, location);
            this.name = name;
            this.color = color;
      }

      @Override
      public void sleep() {
            super.sleep();
            System.out.println("Кошка по имени " + name + color + " просыпается...");
      }

      @Override
      public void eat() {
            super.eat();
            System.out.println(name + color + " покушал!");
      }

      @Override
      public void makeNoise() {
            super.makeNoise();
            System.out.println(name + " молчит...");
      }
}
