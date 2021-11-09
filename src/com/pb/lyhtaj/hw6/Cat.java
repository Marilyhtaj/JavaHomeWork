package com.pb.lyhtaj.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

