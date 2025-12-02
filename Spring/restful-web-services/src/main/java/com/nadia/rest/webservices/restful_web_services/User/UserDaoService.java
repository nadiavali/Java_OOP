package com.nadia.rest.webservices.restful_web_services.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Nadia", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(3, "Cem", LocalDate.now().minusYears(40)));
    }

    public List<User> findAll() {
       return users; 
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
