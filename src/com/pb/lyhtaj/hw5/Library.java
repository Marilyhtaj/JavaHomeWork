package com.pb.lyhtaj.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setNamebook("Приключения");
        book1.setAutorbook("Демьяненко А.В.");
        book1.setYear("2001");

        book2.setNamebook("Словарь");
        book2.setAutorbook("Сидоров А.К.");
        book2.setYear("1998");

        book3.setNamebook("Энциклопедия");
        book3.setAutorbook("Гусев В.В.");
        book3.setYear("2001");

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setFio("Петров И.И.");
        reader1.setNumberticket(1356);
        reader1.setFakultet("Филологический");
        reader1.setDob("03.05.1986");
        reader1.setNumberphone("097563258");

        reader2.setFio("Сидоров В.Н.");
        reader2.setNumberticket(1257);
        reader2.setFakultet("Геологический");
        reader2.setDob("01.10.1993");
        reader2.setNumberphone("0665896314");

        reader3.setFio("Марин А.Р.");
        reader3.setNumberticket(2365);
        reader3.setFakultet("Математический");
        reader3.setDob("04.11.1980");
        reader3.setNumberphone("0985214785");


        System.out.println(book1.getinfo());
        System.out.println(book2.getinfo());
        System.out.println(book3.getinfo());

        System.out.println(reader1.getinfo());
        System.out.println(reader2.getinfo());
        System.out.println(reader3.getinfo());

        reader1.takeBook("Петров И.И.","Приключения", "Словарь", "Энциклопедия");
        reader3.returnBook("Сидоров В.Н.", "Приключения", "Словарь", "Энциклопедия");

    }
}
