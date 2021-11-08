package com.pb.lyhtaj.hw6;

import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) {
       // Animal an = new Animal();
        //an.setFood("мясо");
        //an.sleep();

        //Dog dog = new Dog();
        //dog.setFood("кости");
        //dog.sleep();

        Dog dog = new Dog("косточки", "будка", "Бобик", "такса");
        Cat cat = new Cat("мыши", "дом", "Пушистик");
        Horse horse = new Horse("трава", "конюшня", "Ураган", "черного цвета");

        dog.sleep();
        dog.eat();
        dog.makeNoise();
        System.out.println("");

        cat.sleep();
        cat.eat();
        cat.makeNoise();
        System.out.println("");

        horse.sleep();
        horse.eat();
        horse.makeNoise();

    }
}
