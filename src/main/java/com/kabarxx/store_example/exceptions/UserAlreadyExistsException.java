package com.kabarxx.store_example.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {
        super("Username or email is already taken");
    }
}
