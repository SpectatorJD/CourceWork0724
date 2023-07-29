package com.example.courceWork0724.serice;

import com.example.courceWork0724.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestion(int amount);
}
