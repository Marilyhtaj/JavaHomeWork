package com.pb.lyhtaj.hw8;

import java.util.Objects;
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


//    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
//
//        if (Pattern.matches("[a-zA-Z0-9]{5,20}]", login)) {
//            if (Pattern.matches("[a-zA-Z0-9] {5}]", password)) {
//                if (password.equals(confirmPassword)) {
//                    this.login = login;
//                    this.password = password;
//                    System.out.println("Регистрация прошла успешно!");
//                } else {
//                    throw new WrongPasswordException("Пароли не совпадают!");
//                }
//            } else {
//                throw new WrongPasswordException("Пароль не соответветсвует требованиям!");
//            }
//        } else {
//            throw new WrongLoginException("Логин не соответветсвует требованиям!");
//        }
//    }



    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!Pattern.matches("[a-zA-Z0-9]{5,20}]", login)) {
            throw new WrongLoginException("Логин не соответветсвует требованиям!");
        }
        else if (!Pattern.matches("[a-zA-Z0-9_]{5,1000}]", password)) {
            throw new WrongPasswordException("Пароль не соответветсвует требованиям!");
        }
        else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("Регистрация прошла успешно!");
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }


    // Вход

//    public void signIn(String password, String login) throws WrongLoginException, WrongPasswordException {
//        if (this.login.equals(login)){
//            System.out.println("Вход в кабинет осущетсвлен успешно");
//        }
//        if (this.password.equals(password)){
//
//        }
//        else
//        {
//            throw new WrongPasswordException("Неверно введен логин или пароль!");
//        }
//    }

    public void signIn(String password, String login) throws WrongLoginException, WrongPasswordException {
        if (this.login.equals(login)) {
            if (this.password.equals(password))
             System.out.println("Вход в кабинет осущетсвлен успешно");
             else {throw new WrongPasswordException("Неверно введен пароль!");
             }
        }  else {
            throw new WrongLoginException("Неверно введен логин!");
        }
    }
}

