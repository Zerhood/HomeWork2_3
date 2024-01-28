package com.savelyev.springboot.homework2_3.springboot.controller;

import com.savelyev.springboot.homework2_3.springboot.service.ServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ServiceInterface service;

    public Controller(ServiceInterface service) {
        this.service = service;
    }

    @RequestMapping(path = {"/", "/calculator"}, method = RequestMethod.GET)
    public String initMethod() {
        return service.startMethod();
    }

    @RequestMapping(path = {"/calculator/plus"}, method = RequestMethod.GET)
    public String plusMethod(@RequestParam(value = "num1", required = false) String one,
                             @RequestParam(value = "num2", required = false) String two) {
        return service.plusMethod(one, two);
    }

    @RequestMapping(path = {"/calculator/minus"}, method = RequestMethod.GET)
    public String minusMethod(@RequestParam(value = "num1", required = false) String one,
                              @RequestParam(value = "num2", required = false) String two) {
        return service.minusMethod(one, two);
    }

    @RequestMapping(path = {"/calculator/multiply"}, method = RequestMethod.GET)
    public String multiplyMethod(@RequestParam(value = "num1", required = false) String one,
                                 @RequestParam(value = "num2", required = false) String two) {
        return service.multiplyMethod(one, two);
    }

    @RequestMapping(path = {"/calculator/divide"}, method = RequestMethod.GET)
    public String divideMethod(@RequestParam(value = "num1", required = false) String one,
                               @RequestParam(value = "num2", required = false) String two) {
        return service.divideMethod(one, two);
    }
}