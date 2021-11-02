package com.pb.lyhtaj.hw5;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.setNamebook("Приключения");
        book.setAutorbook("Демьяненко А.В.");
        book.setYear("2001");
        System.out.println(book.getinfo());

        Reader reader = new Reader();
        reader.setFio("Петров И.И.");
        reader.setNumberticket(1356);
        reader.setFakultet("Филологический");
        //reader.setNumberphone(097563258L);

        reader.takeBook("Петров И.И.");

    }
}
