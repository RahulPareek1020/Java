package com.company.exception;

public class NoUserLoggedInException extends Throwable {
    public NoUserLoggedInException(String s) {
        super(s);
    }
}
