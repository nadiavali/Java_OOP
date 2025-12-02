package com.nadia.TodoWebApp.Todo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


// DataBase(Mysql)
//static list of  todos--->(h2,mysql)
@Entity // directly starts creating table
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    //@Size(min = 10, message = "Enter at least 10 characters")
    @Column(name = "description")  // DB column name, not reserved
    private String desc;
    private LocalDate targetDate;
    private boolean done;

    public Todo() { } 
    

    
    public Todo(Integer id, String username, String desc, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.desc = desc;
        this.targetDate = targetDate;
        this.done = done;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getDesc() {
        return desc;
    }


    public void setDesc(String desc) {
        this.desc = desc;
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
        return "Todo [id=" + id + ", username=" + username + ", dec=" + desc + ", targetDate=" + targetDate
                + ", done=" + done + "]";
    }
    
}
