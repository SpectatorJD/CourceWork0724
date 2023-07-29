package com.example.courceWork0724.serice;

import com.example.courceWork0724.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question addQuestion(Question question);

    Collection<Question> getAllQuestion();

    Question removeQuestion (Question question);

    Question getRandomQuestion();

}
