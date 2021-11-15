package com.pb.lyhtaj.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, String color, String price) {
        super(size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка (" + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }
}
