package com.example.springbackend;

import jakarta.persistence.*;

@Entity
@Table(name = "field")
public class Field {

    private Integer id;
    private String content;
    private Integer formID;
    private String type;


   public Field (){

   }

    public Field(String content, Types type, Integer formID) {
        this.content = content;
        this.type = type.toString();
        this.formID = formID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type.toString();
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFormID() {
        return formID;
    }

    public void setFormID(Integer formID) {
        this.formID = formID;
    }
}
