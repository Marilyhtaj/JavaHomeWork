package com.pb.lyhtaj.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.setFood("мясо");
        an.sleep();

        Dog dog = new Dog();
        dog.setFood("кости");
        dog.sleep();
    }
}
