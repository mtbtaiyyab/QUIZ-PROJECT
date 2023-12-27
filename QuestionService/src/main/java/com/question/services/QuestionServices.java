package com.question.services;

import com.question.entities.Question;

import java.util.List;


public interface QuestionServices {

    Question create(Question question);

    List<Question> get();

    Question getSingleQuestion(Long id);

    List<Question> getQuestionsByQuizId(Long quizId);
}
