package com.savelyev.springboot.homework2_3.springboot.controller;

import com.savelyev.springboot.homework2_3.springboot.exceptionHandler.ExceptionHandler;
import com.savelyev.springboot.homework2_3.springboot.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;
    private final ExceptionHandler handler;

    public CalculatorController(CalculatorService service,
                                ExceptionHandler handler) {
        this.service = service;
        this.handler = handler;
    }

    @GetMapping
    public String initMethod() {
        return service.startMethod();
    }

    @GetMapping("/plus")
    public String plusMethod(@RequestParam(value = "num1", required = false) Integer one,
                             @RequestParam(value = "num2", required = false) Integer two) {
        int result;
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            result = service.plusMethod(one, two);
        } else {
            return handler.isNull();
        }
        return one + " + " + two + " = " + result;
    }

    @GetMapping("/minus")
    public String minusMethod(@RequestParam(value = "num1", required = false) Integer one,
                              @RequestParam(value = "num2", required = false) Integer two) {
        int result;
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            result = service.minusMethod(one, two);
        } else {
            return handler.isNull();
        }
        return one + " - " + two + " = " + result;
    }

    @GetMapping("multiply")
    public String multiplyMethod(@RequestParam(value = "num1", required = false) Integer one,
                                 @RequestParam(value = "num2", required = false) Integer two) {
        int result;
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            result = service.multiplyMethod(one, two);
        } else {
            return handler.isNull();
        }
        return one + " * " + two + " = " + result;
    }

    @GetMapping("/divide")
    public String divideMethod(@RequestParam(value = "num1", required = false) Integer one,
                               @RequestParam(value = "num2", required = false) Integer two) {
        double result;
        if (handler.matchNotNull(one) && handler.matchNotNull(two)) {
            if (handler.matchZero(two)) {
                result = service.divideMethod(one, two);
            } else {
                return handler.isMatchZero();
            }
        } else {
            return handler.isNull();
        }
        return one + " / " + two + " = " + result;
    }
}