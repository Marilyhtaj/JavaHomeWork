package com.pb.lyhtaj.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(poroda, dog.poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, poroda);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                '}';
    }
}
