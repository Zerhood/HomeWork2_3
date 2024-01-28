package com.savelyev.springboot.homework2_3.springboot.exceptionHandler;

public interface ExceptionHandler {
    boolean matchInteger(String a, String b);
    String noMatchInteger();
    boolean matchZero(String a);
    String isMatchZero();

    boolean matchNotNull(String a);
    String isNull();
}