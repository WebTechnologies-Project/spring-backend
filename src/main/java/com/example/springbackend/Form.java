package com.example.springbackend;

import jakarta.persistence.*;


@Entity
@Table(name = "form")
public class Form {

    private Integer id;
    private String title;
    private String description;


    public Form(){

    }
    public Form(String title, Integer id, String description) {
        this.title = title;
        this.id = id;
        this.description = description;

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


}
