package com.example.calculator.model;

import java.util.regex.Pattern;

public class Calculator {
    private String leftNumber;
    private String rightNumber;
    private String operator;

    public Calculator() {
    }

    public Calculator(String leftNumber, String rightNumber, String operator) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.operator = operator;
    }

    public String getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(String leftNumber) {
        this.leftNumber = leftNumber;
    }

    public String getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(String rightNumber) {
        this.rightNumber = rightNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

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
