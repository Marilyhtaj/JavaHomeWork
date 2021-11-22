package com.pb.lyhtaj.hw8;

import java.util.regex.Pattern;

public class Auth {

    protected String login;
    protected String password;


    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Зарегистрироваться

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (Pattern.matches("[a-zA-Z0-9]{5,20}]", login)) {
            if (Pattern.matches("[a-zA-Z0-9] {5}]", password)) {
                if (password.equals(confirmPassword)) {
                    this.login = login;
                    this.password = password;
                    System.out.println("Регистрация прошла успешно!");
                } else {
                    throw new WrongPasswordException("Пароли не совпадают!");
                }
            } else {
                throw new WrongPasswordException("Пароль не соответветсвует требованиям!");
            }
        } else {
            throw new WrongLoginException("Логин не соответветсвует требованиям!");
        }
    }

    // Вход

    public void signIn(String password, String login) throws WrongLoginException, WrongPasswordException {
        if (this.login.equals(login)) {
            if (this.password.equals(password))
             System.out.println("Вход в кабинет осущетсвлен успешно");
             else {throw new WrongPasswordException("Неверно введен логин или пароль!");
             }
        }  else {
            throw new WrongLoginException("Неверно введен логин или пароль!");
        }
    }
}

