package com.savelyev.springboot.homework2_3.springboot.service;

import com.savelyev.springboot.homework2_3.springboot.exceptionHandler.ExceptionHandler;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CalculatorServiceImp implements CalculatorService {

    private final ExceptionHandler handler;

    public CalculatorServiceImp(ExceptionHandler handler) {
        this.handler = handler;
    }

    DecimalFormat format = new DecimalFormat("#,##");

    public String startMethod() {
        return "Добро пожаловать в калькулятор";
    }

    public int plusMethod(int one, int two) {
        return one + two;
    }

    public int minusMethod(int one, int two) {
        return one - two;
    }

    public int multiplyMethod(int one, int two) {
        return one * two;
    }

    public double divideMethod(int one, int two) {
        double result = (double) one / two;
        return Double.parseDouble(format.format(result));
    }
}