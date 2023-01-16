package com.example.springbackend.repository;

import com.example.springbackend.Answer;
import com.example.springbackend.Field;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findAllByFieldID(Integer id);
}