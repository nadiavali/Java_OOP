package com.nadia.java;

import java.util.logging.Logger;
import java.util.logging.Level;



public class Person {
    private static final Logger logger = Logger.getLogger(Person.class.getName());
    
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private String eyeColour;
    
    

    public Person(String firstName, String lastName, int age, int height, int weight, String eyeColour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        //return getFirstName() + getLastName();
        return getFirstName().concat(" ").concat(getLastName());
    }

    public String getLastName() {
        return lastName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public int getHeight() {
        return height;
    }



    public void setHeight(int height) {
        this.height = height;
    }



    public int getWeight() {
        return weight;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }



    public String getEyeColour() {
        return eyeColour;
    }



    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }
    
    // Main method to create an instance and log full name
    public static void main(String[] args) {
        Person p = new Person("Nadia", "Vali", 32, 160, 46, "Black Brown");
        logger.log(Level.INFO, "Person's full name: "+ p.getFullName());
    }
}
    


