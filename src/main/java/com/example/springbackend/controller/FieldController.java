package com.example.springbackend.controller;

import com.example.springbackend.Field;
import com.example.springbackend.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/fields")
public class FieldController {
    @Autowired
    FieldService fieldService;

    @GetMapping("")
    public List<Field> list() {
        return fieldService.listAllFields();
    }

    @GetMapping("/by-form/{id}")
    public List<Field> listByForm(@PathVariable Integer id){
        return fieldService.findAllByFormID(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Field> get(@PathVariable Integer id) {
        try {
            Field field = fieldService.getField(id);
            return new ResponseEntity<Field>(field, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Field>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Field field) {
        fieldService.saveField(field);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Field field, @PathVariable Integer id) {
        try {
            Field existField = fieldService.getField(id);
            field.setId(id);
            fieldService.saveField(field);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        fieldService.deleteField(id);
    }
}
