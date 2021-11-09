package com.pb.lyhtaj.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("косточки","будка");
        animals[1] = new Animal("мыши","дом");
        animals[2] = new Animal("трава","конюшня");


        Dog[] dogs = new Dog[1];
        dogs[0] = new Dog("косточки", "будка", "Бобик", "такса");

        Cat[] cats = new Cat[1];
        cats[0] = new Cat("мыши", "дом", "Пушистик");

        Horse[] horses = new Horse[1];
        horses[0] = new Horse("трава", "конюшня", "Ураган", "черного цвета");

        dogs[0].sleep();
        dogs[0].eat();
        dogs[0].makeNoise();
        System.out.println("");

        cats[0].sleep();
        cats[0].eat();
        cats[0].makeNoise();
        System.out.println("");

        horses[0].sleep();
        horses[0].eat();
        horses[0].makeNoise();
        System.out.println("");


        Class anClazz = Class.forName("com.pb.lyhtaj.hw6.Veterinarian");
        Veterinarian vetDoc = (Veterinarian)anClazz.newInstance();
        vetDoc.treatAnimal(animals);


    }
}
