package com.pb.lyhtaj.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Приветствуем! Вы на странице регистрации");
        System.out.println("Введите логин для регистрации: ");
        String log = skan.nextLine();
        System.out.println("Введите пароль для регистрации: ");
        String pass = skan.nextLine();
        System.out.println("Повторите пароль: ");
        String confirmPass = skan.nextLine();
        Auth user = new Auth(log,pass,confirmPass);

        try {
            user.signUp(log,pass,confirmPass);
        } catch (WrongLoginException e1){
            System.out.println(e1.getMessage());
        }catch (WrongPasswordException e2){
            System.out.println(e2.getMessage());
        }

        System.out.println("Для входа в личный кабинет введите логин и пароль");
        System.out.println("Логин: ");
        String log1 = skan.next();
        System.out.println("Пароль: ");
        String pass1 = skan.next();
        Auth user1 = new Auth(log1,pass1);
        try{
            user1.signIn(log1,pass1);
        } catch (WrongLoginException e3){
            System.out.println(e3.getMessage());
        }catch (WrongPasswordException e4){
            System.out.println(e4.getMessage());
        }
    }
}
