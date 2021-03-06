package com.java.hellodb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private boolean urgent;

    public Task(){} //empty contructor

    public Task(String text, boolean urgent) {
        this.text = text;
        this.urgent = urgent;
    }

    public String getText() { //returns text
        return text;
    }

    public void setText(String text){ //sets text
        this.text= text;
    }

    public boolean isUrgent(){ //true or false for urgent
        return urgent;
    }

    public void setUrgent(boolean urgent) { // Sets urgency
        this.urgent=urgent;
    }

    @Override
    public String toString(){ // Lists task + ID + it's urgency
        return "Task{" +
                "id=" + id +
                ", text='" + text +  '\'' +
                ", urgent=" + urgent +
                '}';

    }
}
