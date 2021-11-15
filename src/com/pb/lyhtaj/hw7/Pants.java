package com.pb.lyhtaj.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {

    public Pants(Size size, String color, String price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Брюки (" + getSize() +", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }

    @Override
    public void dressWomen() {
        System.out.println("Брюки (" + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }
}
