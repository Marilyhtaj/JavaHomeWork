package com.pb.lyhtaj.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, String color, String price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук (" + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice() + " )");
    }
}
