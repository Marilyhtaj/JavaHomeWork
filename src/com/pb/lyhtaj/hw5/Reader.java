package com.pb.lyhtaj.hw5;

public class Reader {
    private String fio;
    private int numberticket;
    private String fakultet;
    private String dob;
    private String numberphone;

    public Reader(String fio, int numberticket, String fakultet, String dob, String numberphone){
        this.fio = fio;
        this.numberticket = numberticket;
        this.fakultet = fakultet;
        this.dob = dob;
        this.numberphone = numberphone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberticket() {
        return numberticket;
    }

    public void setNumberticket(int numberticket) {
        this.numberticket = numberticket;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public void takeBook(String fio) {
        System.out.println(fio + " взял " + Book.getCount() + " книги." );
    }

    public void takeBook (String...namebooks){
        System.out.println(this.fio + " взял книги: ");
     for (String namebook : namebooks) {
         System.out.println(namebook);
    }
    }

    public void takeBook(Book...books) {
        System.out.println(this.fio + " взял книги: ");
        for (Book book : books){
            System.out.println(book.getNamebook() + "( " + book.getAutorbook() + " " + book.getYear() + " )");
        }
    }

    public void returnBook ( String...namebooks){
        System.out.println(this.fio + " вернул книги: ");
        for (String namebook : namebooks) {
            System.out.println(namebook);
        }
    }

    public void returnBook (Book...books) {
        System.out.println(this.fio + " вернул книги: ");
        for (Book book : books){
            System.out.println(book.getNamebook() + "( " + book.getAutorbook() + " " + book.getYear() + " )");
        }
    }

   public void returnBook(String fio) {
     System.out.println(fio + " вернул " + Book.getCount() + " книги." );
   }


        String getinfo (){
            return "Читатель: " + fio + "( номер билета: "  + numberticket + ", факультет: " + fakultet + ", дата рождения:  " + dob + ", номер телефона: " + numberphone + " )";
        }
    }
