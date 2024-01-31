package com.savelyev.springboot.homework2_3.springboot.service;

public interface CalculatorService {
    String startMethod();
    int plusMethod(int one, int two);
    int minusMethod(int one, int two);
    int multiplyMethod(int one, int two);
    double divideMethod(int one, int two);
}