package com.pb.lyhtaj.hw5;

public class Book {

    private static int count=0;

    public static int getCount(){
        return count;
    }

    private String namebook;
    private String autorbook;
    private String year;


    public Book(String namebook,String autorbook, String year){
        this.namebook = namebook;
        this.autorbook = autorbook;
        this.year = year;
        count++;

    }

    public String getNamebook(){
        return namebook;
    }

    public void setNamebook(String namebook){
        this.namebook = namebook;
    }

    public String getAutorbook() {
        return autorbook;
    }

    public void setAutorbook(String autorbook) {
        this.autorbook = autorbook;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    String getinfo(){
        return "Название книги: " + namebook + "( " + autorbook + " " + year + ")";
    }
}
