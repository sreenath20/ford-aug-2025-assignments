package com.example.mapping_assignment.mapping;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LibraryControllerAdvice {
    @ExceptionHandler(MemberNotFoundException.class)
    public String handleMemberNotFoundException(MemberNotFoundException e){
        return e.getMessage();
    }

    @ExceptionHandler(AuthorNotFOundException.class)
    public String handleAuthorNotFoundException(AuthorNotFOundException e){
        return e.getMessage();
    }

    @ExceptionHandler(BookNotFoundException.class)
    public String handleBookNotFoundException(BookNotFoundException e){
        return e.getMessage();
    }

    @ExceptionHandler(BorrowingLimitExceededException.class)
    public String handleBorrowingLimitExceededException(BorrowingLimitExceededException e){
        return e.getMessage();
    }

    @ExceptionHandler(DuplicateBorrowException.class)
    public String handleDuplicateBorrowException(DuplicateBorrowException e){
        return e.getMessage();
    }

    @ExceptionHandler(BookAlreadyExistsException.class)
    public  String handleBookAlreadyExistsException(BookAlreadyExistsException e){
        return e.getMessage();
    }

    @ExceptionHandler(InvalidCardException.class)
    public String handleInvalidCardException(InvalidCardException e){
        return e.getMessage();
    }
}
