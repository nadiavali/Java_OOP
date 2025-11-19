package com.nadia.TodoWebApp.Todo;

import java.time.LocalDate;


// DataBase(Mysql)
//static list of  todos--->(h2,mysql)
public class Todo {
    private int id;
    private String username;
    private String decription;
    private LocalDate targetDate;
    private boolean done;


    public Todo(int id, String username, String decription, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.decription = decription;
        this.targetDate = targetDate;
        this.done = done;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getDecription() {
        return decription;
    }


    public void setDecription(String decription) {
        this.decription = decription;
    }


    public LocalDate getTargetDate() {
        return targetDate;
    }


    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }


    public boolean isDone() {
        return done;
    }


    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", decription=" + decription + ", targetDate=" + targetDate
                + ", done=" + done + "]";
    }
    
}
