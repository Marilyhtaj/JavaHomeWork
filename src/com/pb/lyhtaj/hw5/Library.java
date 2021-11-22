package com.pb.lyhtaj.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения","Демьяненко А.В.","2001");
        Book book2 = new Book("Словарь","Толстой А.К.", "1998");
        Book book3 = new Book("Энциклопедия","Гусев В.В.","2003");

        Reader reader1 = new Reader("Петров И.И.",1356,"Филологический", "03.05.1986","097563258");
        Reader reader2 = new Reader("Сидоров В.Н.", 1257,"Геологический","01.10.1993","0665896314");
        Reader reader3 = new Reader("Марин А.Р.",2365,"Математический","04.11.1980","0985214785");

        System.out.println(book1.getinfo());
        System.out.println(book2.getinfo());
        System.out.println(book3.getinfo());
        System.out.println();

        System.out.println(reader1.getinfo());
        System.out.println(reader2.getinfo());
        System.out.println(reader3.getinfo());
        System.out.println();

        reader1.takeBook(2);
        System.out.println();
        reader1.takeBook("Петров И.И.");
        System.out.println();
        reader1.takeBook("Приключения","Словарь","Энциклопедия");
        System.out.println();
        reader1.takeBook(book1,book2,book3);
        System.out.println();
        reader2.returnBook("Сидоров В.Н.");
        System.out.println();
        reader2.returnBook( "Приключения", "Словарь", "Энциклопедия");
        System.out.println();
        reader2.returnBook(book1,book2,book3);

    }
}
