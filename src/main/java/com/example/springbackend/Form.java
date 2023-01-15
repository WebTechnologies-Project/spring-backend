package com.example.springbackend;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "form")
public class Form {

    private Integer id;
    private String title;
    private String description;
    private Boolean isOpen;
//    public ArrayList<Field> fields = new ArrayList<>();

    public Form(){

    }
    public Form(String title, Integer id, String description, Boolean isOpen) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.isOpen = isOpen;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

//    public void setFields(ArrayList<Field> fields) {
//        this.fields = fields;
//    }
}
