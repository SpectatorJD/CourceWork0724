package com.example.courceWork0724.repository;

import com.example.courceWork0724.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion (Question question);

    Question removeQuestion (Question question);
    Collection<Question> getAllQuestion();

}
