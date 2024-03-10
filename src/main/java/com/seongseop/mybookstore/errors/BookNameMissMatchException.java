package com.seongseop.mybookstore.errors;

public class BookNameMissMatchException extends RuntimeException {
    public BookNameMissMatchException(String s) {
        super(s);
    }
}
