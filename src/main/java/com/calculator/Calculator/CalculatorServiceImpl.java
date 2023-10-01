package com.calculator.Calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetingsСalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.";
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.";
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.";
        }
        if (num1 == 0 || num2 == 0) {
            return "Ошибка! Произведена попытка деление на 0";
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }

}
