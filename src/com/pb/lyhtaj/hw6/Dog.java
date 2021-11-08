package com.pb.lyhtaj.hw6;

public class Dog extends Animal {

    private String name;
    private String poroda;

    public Dog(String food, String location, String name, String poroda) {
        super(food, location);
        this.name = name;
        this.poroda = poroda;
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Собака по имени " + name + " (" + poroda + ")" + " проснулась.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака по имени " + name + " (" + poroda + ")" + " покушала");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(name + " гавкает...");
    }
}
