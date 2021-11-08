package com.example.calculator.model;

import lombok.*;

import java.util.regex.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    private String leftNumber;
    private String rightNumber;
    private String operator;

    public double calculateResult(String leftNumber, String rightNumber, String operator) {
        double result = 0;
        Pattern pattern = Pattern.compile("^\\d*$");
        if (pattern.matcher(leftNumber).matches() && pattern.matcher(rightNumber).matches()) {
            double i = Double.parseDouble(leftNumber);
            double j = Double.parseDouble(rightNumber);

            switch (operator) {
                case "+":
                    result = i + j;
                    break;
                case "-":
                    result = i - j;
                    break;
                case "*":
                    result = i * j;
                    break;
                case "/":
                    result = i / j;
                    break;
            }
        }

        return result;
    }

}
