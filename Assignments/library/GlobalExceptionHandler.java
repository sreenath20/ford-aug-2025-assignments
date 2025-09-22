package com.demo.library;

import com.demo.library.author.AuthorException;
import com.demo.library.author.AuthorNotFoundException;
import com.demo.library.book.*;
import com.demo.library.member.MemberException;
import com.demo.library.member.MemberNotFoundException;
import com.demo.library.membershipCard.ExpiredMembershipException;
import com.demo.library.membershipCard.InvalidCardException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Map<String, Object> responseMap = new LinkedHashMap<>();

    @ExceptionHandler
    public Map<String, Object> handleException(Exception e, HttpServletRequest request) throws Exception {
        responseMap.put("status", 500);
        responseMap.put("error", HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        responseMap.put("path", request.getRequestURI());
        responseMap.put("exception", e.getClass());
        responseMap.put("message", e.getMessage());
        responseMap.put("timestamp", LocalDateTime.now());
        return responseMap;
    }

    @ExceptionHandler({ MemberNotFoundException.class,
                        BookNotFoundException.class,
                        AuthorNotFoundException.class })
    public Map<String, Object> handleNoTFoundException(Exception e, HttpServletRequest request) throws Exception {
        responseMap.put("status", 404);
        responseMap.put("error", HttpStatus.NOT_FOUND.getReasonPhrase());
        responseMap.put("path", request.getRequestURI());
        responseMap.put("exception", e.getClass());
        responseMap.put("message", e.getMessage());
        responseMap.put("timestamp", LocalDateTime.now());
        return responseMap;
    }

    @ExceptionHandler({ AuthorException.class,
                        BookAlreadyExistsException.class,
                        BookException.class,
                        BorrowingLimitExceedException.class,
                        DuplicateBorrowException.class,
                        ExpiredMembershipException.class,
                        InvalidCardException.class,
                        MemberException.class })
    public Map<String, Object> handleOtherException(Exception e, HttpServletRequest request) throws Exception {
        responseMap.put("status", 400);
        responseMap.put("error", HttpStatus.BAD_REQUEST.getReasonPhrase());
        responseMap.put("path", request.getRequestURI());
        responseMap.put("exception", e.getClass());
        responseMap.put("message", e.getMessage());
        responseMap.put("timestamp", LocalDateTime.now());
        return responseMap;
    }
}
