package com.demo.library.member;

public class MemberAlreadyExistsException extends Exception {


    public MemberAlreadyExistsException(String message) {
        super(message);
    }
}
