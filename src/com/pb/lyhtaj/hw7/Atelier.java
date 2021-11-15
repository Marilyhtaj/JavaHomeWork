package com.pb.lyhtaj.hw7;

public class Atelier {

    public static void main(String[] args) {
        Clothes tshirt = new Tshirt(Size.XXS,"черный","500 UAH");
        Clothes skirt = new Skirt(Size.L,"белый","600 UAH");
        Clothes tie = new Tie(Size.M,"синий","200 UAH");
        Clothes pants = new Pants(Size.S,"красный","700 UAH");
        Clothes[] clothes = new Clothes[] {tshirt,skirt,tie,pants};

       dressMan(clothes);
       dressWomen(clothes);

        System.out.println(" ");

        Size[] sizes = Size.values();
        System.out.println("Размеры: ");
            for (Size size: sizes){
                System.out.println(size);
        }
    }

    public static void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда: ");
        for (Clothes clothe: clothes){
            if (clothe instanceof ManClothes){
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда: ");
        for (Clothes clothe: clothes){
            if (clothe instanceof WomenClothes){
                ((WomenClothes) clothe).dressWomen();
            }
        }

    }
}
