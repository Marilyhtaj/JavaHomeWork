package com.pb.lyhtaj.hw6;

import java.util.Objects;

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
            System.out.println(name + " " + color + " покушал!");
      }

      @Override
      public void makeNoise() {
            super.makeNoise();
            System.out.println(name + " молчит...");
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Horse horse = (Horse) o;
            return Objects.equals(name, horse.name) && Objects.equals(color, horse.color);
      }

      @Override
      public int hashCode() {
            return Objects.hash(super.hashCode(), name, color);
      }

      @Override
      public String toString() {
            return "Horse{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
      }
}

