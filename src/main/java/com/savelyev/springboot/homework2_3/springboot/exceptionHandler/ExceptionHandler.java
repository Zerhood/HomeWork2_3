package com.savelyev.springboot.homework2_3.springboot.exceptionHandler;

public interface ExceptionHandler {
    boolean matchZero(int a);
    String isMatchZero();
    boolean matchNotNull(Object a);
    String isNull();
}