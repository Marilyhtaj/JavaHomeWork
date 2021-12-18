package com.pb.lyhtaj.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        Auth user = new Auth();

        while (true) {
            System.out.println("Приветствуем в ОнлайнМагазине!");
            System.out.println("Выберите действие: ");
            System.out.println("1 - Регистрация в ОнлайнМагазине");
            System.out.println("2 - Вход в ОнлайнМагазин");
            System.out.println("3 - Выход");

            String choice = skan.nextLine();

            switch (choice) {
                case "1":
                    signUp(skan, user);
                    break;
                case "2":
                    signIn(skan, user);
                    break;
                case "3":
                    System.out.println("Выход!");
                    break;
                default:
                    System.out.println("Выбор не сделан!");
            }
        }
    }
    private static void signUp (Scanner skan, Auth user){
        System.out.println("Введите логин для регистрации: ");
        String login = skan.nextLine();
        System.out.println("Введите пароль для регистрации: ");
        String password = skan.nextLine();
        System.out.println("Повторите пароль: ");
        String confirmPassword = skan.nextLine();

        try {
            user.signUp(login, password, confirmPassword);
            System.out.println("Регистрация прошла успешно!");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void signIn(Scanner skan, Auth user){
        System.out.println("Для входа в личный кабинет введите логин и пароль");
        System.out.println("Логин: ");
        String login = skan.next();
        System.out.println("Пароль: ");
        String password = skan.next();

        try{
            user.signIn(login,password);
            System.out.println("Вход в кабинет осущетсвлен успешно");
        } catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
    }
}
