package com.pb.lyhtaj.hw7;

public abstract class Clothes {
    private Size size;
    private String color;
    private String price;

    public Clothes(Size size, String color, String price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }
}
