package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("")
    public ModelAndView showInfo() {
        return new ModelAndView("list");
    }

    @PostMapping("")
    public String showInfo(@RequestParam("left") String leftNumber,
                           @RequestParam("right") String rightNumber,
                           @RequestParam String operator,
                           Model model) {
        Calculator calculator = new Calculator();
        double result = calculator.calculateResult(leftNumber, rightNumber, operator);
        model.addAttribute("result", result);
        return "list";
    }

}
