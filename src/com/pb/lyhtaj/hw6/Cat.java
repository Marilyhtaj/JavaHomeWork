package com.pb.lyhtaj.hw6;

public class Cat extends Animal{

    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Кошка по имени " + name + " просыпается...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка по имени " + name + " покушал!");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(name + " мяукает...");
    }
}
