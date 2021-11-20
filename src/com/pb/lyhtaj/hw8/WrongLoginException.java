package com.pb.lyhtaj.hw8;

public class WrongLoginException extends Exception{
    protected String log;

    public WrongLoginException(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }
}
