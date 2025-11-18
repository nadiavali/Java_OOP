package com.nadia.spring.learn_JPA_hibernate.Course;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


///(name ="Course_Data") or whatever name by default is the namae of table(class)
@Entity
public class Course {

    @Id
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="author")
    private String author;  

    public Course() {
    }

    public Course(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }       
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    
    // setters are nessecerry to select by id 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    
}
