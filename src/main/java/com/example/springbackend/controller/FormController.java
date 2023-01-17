package com.example.springbackend.controller;

import com.example.springbackend.Form;
import com.example.springbackend.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/forms")
public class FormController {
    @Autowired
    FormService formService;

    @GetMapping("")
    public List<Form> list() {
        return formService.listAllForms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Form> get(@PathVariable Integer id) {
        try {
            Form form = formService.getForm(id);
            return new ResponseEntity<Form>(form, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Form>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Form form) {
        formService.saveForm(form);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Form form, @PathVariable Integer id) {
        try {
            Form existForm = formService.getForm(id);
            form.setId(id);
            formService.saveForm(form);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        formService.deleteForm(id);
    }
}
