package com.example.springbackend.service;
import com.example.springbackend.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbackend.repository.FieldRepository;


import java.util.List;
@Service

public class FieldService {

    @Autowired
    private FieldRepository fieldRepository;
    public List<Field> listAllFields() {
        return fieldRepository.findAll();
    }

    public void saveField(Field field) {
        fieldRepository.save(field);
    }

    public Field getField(Integer id) {
        return fieldRepository.findById(id).get();
    }

    public void deleteField(Integer id) {
        fieldRepository.deleteById(id);
    }

    public List<Field> findAllByFormID(Integer id) {
        return fieldRepository.findAllByFormID(id);
    }
}
