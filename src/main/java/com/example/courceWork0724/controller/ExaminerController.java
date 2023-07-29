package com.example.courceWork0724.controller;

import com.example.courceWork0724.model.Question;
import com.example.courceWork0724.serice.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public class ExaminerController {
    private final ExaminerService examinerService;


    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/exam/get/{amount}")
    public Collection<Question>getQuestions(@PathVariable Integer amount){
        return examinerService.getQuestion(amount);
    }
}

