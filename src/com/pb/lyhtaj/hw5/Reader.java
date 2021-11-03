package com.pb.lyhtaj.hw5;

public class Reader {
    private String fio;
    private int numberticket;
    private String fakultet;
    private String dob;
    private String numberphone;

    int count = 0;

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

    public void takeBook (String fio){
        count++;
        System.out.println(fio + " взял" + count + " книги");
    }

    // public void takeBook (String fio, String... namebooks) {
    //     System.out.println(fio + "взял несколько книг" + namebooks.toString());
    //     for (String namebook : namebooks) {
    //         System.out.println(namebook);
      //  }
    //}
        String getinfo (){
            return "Читатель: " + fio + "( номер билета: "  + numberticket + ", факультет: " + fakultet + ", дата рождения:  " + dob + ", номер телефона: " + numberphone + " )";
        }
    }
