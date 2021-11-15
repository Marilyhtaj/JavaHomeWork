package com.pb.lyhtaj.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size size, String color, String price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка мужская (" + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка женская (" + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }

}
