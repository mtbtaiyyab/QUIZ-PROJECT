package com.question.services.impl;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServicesImpl implements QuestionServices {

    private final QuestionRepository questionRepository;

    public QuestionServicesImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getSingleQuestion(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Data Not Found!!!"));
    }
}
