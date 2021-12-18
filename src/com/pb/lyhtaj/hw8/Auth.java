package com.pb.lyhtaj.hw8;

public class Auth {

    private String login = "Masha1";
    private String password = "qwerty123";

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.matches("[a-zA-Z0-9]{5,20}]")) {
            throw new WrongLoginException("Логин не соответветсвует требованиям!");
        }
        if (password == null || password.matches("[a-zA-Z0-9_]{5,1000}]")) {
            throw new WrongPasswordException("Пароль не соответветсвует требованиям!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
            this.login = login;
            this.password = password;

    }


    public void signIn(String password, String login) throws WrongLoginException {
        if (this.login.equals(login)) {
            throw new WrongLoginException("Пользователь не найден!");}
        if (this.password.equals(password)){
             throw new WrongLoginException("Пользовтель не найден!");}
    }
}

