package com.pb.lyhtaj.hw8;

public class WrongLoginException extends Exception{

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
