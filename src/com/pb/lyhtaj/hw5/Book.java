package com.pb.lyhtaj.hw5;

public class Book {
    private String namebook;
    private String autorbook;
    private String year;

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
        return namebook + "( " + autorbook + " " + year + " )";
    }
}
