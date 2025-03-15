package com.nadia.java;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testPerson() {
        Person p = new Person("Nadia","Vali" ,32, 160, 46, "Black Brown");

        Logger l = Logger.getLogger(Person.class.getName());
        l.info("created new person name: " + p.getFirstName());

        assertEquals("Nadia", p.getFirstName());
        assertEquals(32, p.getAge());
        assertEquals(160, p.getHeight());
        assertEquals(46, p.getWeight());
        assertEquals("Black Brown", p.getEyeColour());
    }

  
}




