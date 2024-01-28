package com.savelyev.springboot.homework2_3.springboot.exceptionHandler;

import org.springframework.stereotype.Service;

@Service
public class ExceptionHandlerImp implements ExceptionHandler {

    @Override
    public boolean matchInteger(String a, String b) {
        return a.matches("\\d+") && b.matches("\\d+");
    }

    @Override
    public String noMatchInteger() {
        return "Введеные параметры не являются числом!";
    }

    @Override
    public boolean matchZero(String a) {
        return Integer.parseInt(a) != 0;
    }

    @Override
    public String isMatchZero() {
        return "Делить на ноль нельзя!";
    }

    @Override
    public boolean matchNotNull(String a) {
        return a != null;
    }

    @Override
    public String isNull() {
        return "Одно из полей пустое!";
    }
}