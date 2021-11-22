package com.pb.lyhtaj.hw8;

import java.util.regex.Pattern;

public class Auth {

    protected String login;
    protected String password;
    protected String confirmPassword;


    public Auth(String login, String password,String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (Pattern.matches("[a-zA-Z0-9]{5,20}]", login)) {
            throw new WrongLoginException("Логин не соответветсвует требованиям!");
        }
        else if (Pattern.matches("[a-zA-Z0-9_]{5,1000}]", password)) {
            throw new WrongPasswordException("Пароль не соответветсвует требованиям!");
        }
        else if (password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("Регистрация прошла успешно!");
        }
    }


    public void signIn(String password1, String login1) throws WrongLoginException, WrongPasswordException {
        if (login1.equals(login)) {
            throw new WrongLoginException("Неверно введен логин!");
        } else if (password1.equals(password)){
             throw new WrongPasswordException("Неверно введен пароль!");
             }  else {
            System.out.println("Вход в кабинет осущетсвлен успешно");
        }
    }
}

