package com.calculator.Calculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {


    String greetingsСalculator();
    String plus(Integer num1, Integer num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Integer num1, Integer num2);

}
