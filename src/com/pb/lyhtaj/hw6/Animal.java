package com.pb.lyhtaj.hw6;

public class Animal {
    private String food;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void sleep(){
        System.out.println("Животное спит.");
    }
}
