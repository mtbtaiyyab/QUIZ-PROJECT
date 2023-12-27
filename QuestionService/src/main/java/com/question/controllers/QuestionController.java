package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionServices questionServices;

    public QuestionController(QuestionServices questionServices) {
        this.questionServices = questionServices;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return questionServices.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestion(){
        return questionServices.get();
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id){
        return questionServices.getSingleQuestion(id);
    }
}
