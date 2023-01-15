package com.example.springbackend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "field")
public class Field {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String content;
    private Types type;
    private Integer formID;

   public Field (){

   }

    public Field(String content, Types type, Integer formID) {
        this.content = content;
        this.type = type;
        this.formID = formID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public Integer getFormID() {
        return formID;
    }

    public void setFormID(Integer formID) {
        this.formID = formID;
    }
}
