package com.pb.lyhtaj.hw8;

public class Auth {

    protected String login;
    protected String password;


    public Auth(String login,String password) {
    }
    // Зарегистрироваться

    public void signUp(String login,String password,String confirmPassword) throws WrongLoginException,WrongPasswordException{
        int logg = login.length();
        if (logg>=5 && logg<=20){
            System.out.println("длина логина верна");
        }else {
            throw new WrongLoginException("Длина поля должна быть от 5 до 20 символов");
        }
    }
    // Вход

    public void signIn (String password,String login) throws WrongLoginException, WrongPasswordException {
     int pas = password.length();
     if (pas>=5){
         System.out.println("длина пароля верна");
     }else
         throw new WrongPasswordException("Поле некорректно введено");
    }
}

