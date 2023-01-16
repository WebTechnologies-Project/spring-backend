package com.example.springbackend.controller;

import com.example.springbackend.Answer;
import com.example.springbackend.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping("")
    public List<Answer> list() {
        return answerService.listAllAnswers();
    }

    @GetMapping("/by-field/{id}")
    public List<Answer> listByField(@PathVariable Integer id){
        return answerService.findAllByFieldID(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> get(@PathVariable Integer id) {
        try {
            Answer answer = answerService.getAnswer(id);
            return new ResponseEntity<Answer>(answer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Answer>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Answer answer) {
        answerService.saveAnswer(answer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Answer answer, @PathVariable Integer id) {
        try {
            Answer existanswer = answerService.getAnswer(id);
            answer.setId(id);
            answerService.saveAnswer(answer);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        answerService.deleteAnswer(id);
    }
}
