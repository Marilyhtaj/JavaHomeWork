package com.pb.lyhtaj.hw8;

public class WrongPasswordException extends Exception {
    protected String confirmPassword;

    public WrongPasswordException(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
