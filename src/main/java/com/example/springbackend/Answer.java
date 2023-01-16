package com.example.springbackend;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String content;
    private Integer fieldID;

    public Answer(){

    }

    public Answer(Integer id, String content, Integer fieldID) {
        this.id = id;
        this.content = content;
        this.fieldID = fieldID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFieldID() {
        return fieldID;
    }

    public void setFieldID(Integer fieldID) {
        this.fieldID = fieldID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}