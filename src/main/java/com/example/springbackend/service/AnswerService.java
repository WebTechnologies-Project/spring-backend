package com.example.springbackend.service;
import com.example.springbackend.Answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbackend.repository.AnswerRepository;


import java.util.List;
@Service

public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
    public List<Answer> listAllAnswers() {
        return answerRepository.findAll();
    }

    public void saveAnswer(Answer Answer) {
        answerRepository.save(Answer);
    }

    public Answer getAnswer(Integer id) {
        return answerRepository.findById(id).get();
    }

    public void deleteAnswer(Integer id) {
        answerRepository.deleteById(id);
    }

    public List<Answer> findAllByFieldID(Integer id) {
        return answerRepository.findAllByFieldID(id);
    }
}
