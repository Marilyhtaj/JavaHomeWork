package com.pb.lyhtaj.hw5;

import java.util.Date;

public class Reader {
    private String fio;
    private int numberticket;
    private String fakultet;
    private int dob;
    private long numberphone;

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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public long getNumberphone() {
        return numberphone;
    }

    public void takeBook (String fio){
        System.out.println(fio + " взял" + " книги");
    }

    public void setNumberphone(long numberphone) {
        this.numberphone = numberphone;
    }
}
