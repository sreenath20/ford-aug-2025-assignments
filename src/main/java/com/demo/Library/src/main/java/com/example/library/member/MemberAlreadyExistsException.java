package com.example.library.member;

public class MemberAlreadyExistsException extends Exception {
    public MemberAlreadyExistsException(String message) {
        super(message);
    }
}
