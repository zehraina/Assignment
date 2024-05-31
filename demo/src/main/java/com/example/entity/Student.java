package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String id;
    private String name;
    private Map marks;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map getMarks() {
        return marks;
    }
    public void setMarks(Map marks) {
        this.marks = marks;
    }
}
