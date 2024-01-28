package com.savelyev.springboot.homework2_3.springboot.service;

import com.savelyev.springboot.homework2_3.springboot.exceptionHandler.ExceptionHandler;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class ServiceInterfaceImp implements ServiceInterface {

    private final ExceptionHandler handler;

    public ServiceInterfaceImp(ExceptionHandler handler) {
        this.handler = handler;
    }

    DecimalFormat format = new DecimalFormat("#.##");

    public String startMethod() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusMethod(String one, String two) {
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            if (handler.matchInteger(one, two)) {
                int a = Integer.parseInt(one);
                int b = Integer.parseInt(two);
                int c = a + b;
                return a + " + " + b + " = " + c;
            } else {
                return handler.noMatchInteger();
            }
        } else {
            return handler.isNull();
        }
    }

    public String minusMethod(String one, String two) {
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            if (handler.matchInteger(one, two)) {
                int a = Integer.parseInt(one);
                int b = Integer.parseInt(two);
                int c = a - b;
                return a + " - " + b + " = " + c;
            } else {
                return handler.noMatchInteger();
            }
        } else {
            return handler.isNull();
        }
    }

    public String multiplyMethod(String one, String two) {
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            if (handler.matchInteger(one, two)) {
                int a = Integer.parseInt(one);
                int b = Integer.parseInt(two);
                int c = a * b;
                return a + " * " + b + " = " + c;
            } else {
                return handler.noMatchInteger();
            }
        } else {
            return handler.isNull();
        }
    }

    public String divideMethod(String one, String two) {
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            if (handler.matchInteger(one, two)) {
                if (handler.matchZero(two)) {
                    int a = Integer.parseInt(one);
                    int b = Integer.parseInt(two);
                    double c = (double) a / b;
                    return a + " / " + b + " = " + format.format(c);
                } else {
                    return handler.isMatchZero();
                }
            } else {
                return handler.noMatchInteger();
            }
        } else {
            return handler.isNull();
        }
    }
}