package com.pb.lyhtaj.hw11_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person implements Serializable {

    public String fio;
    private LocalDate db;
    private String adres;
    private String phone;
    private LocalDateTime editdatetime;

    public Person(String fio,LocalDate db, String adres, String phone, LocalDateTime editdatetime) {
        this.fio = fio;
        this.db = db;
        this.adres = adres;
        this.phone = phone;
        this.editdatetime = editdatetime;
    }
//
//        public Person() {
//        }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getDb() {
        return db;
    }

    public void setDb(LocalDate db) {
        this.db = db;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getEditdatetime() {
        return editdatetime;
    }

    public void setEditdatetime(LocalDateTime editdatetime) {
        this.editdatetime = editdatetime;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", db=" + db +
                ", adres='" + adres + '\'' +
                ", phone='" + phone + '\'' +
                ", editdatetime=" + editdatetime +
                '}';
    }
}
