package com.nadia.rest.webservices.restful_web_services.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static int userCount = 0;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(userCount++, "Nadia", LocalDate.now().minusYears(30)));
        users.add(new User(userCount++, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(userCount++, "Cem", LocalDate.now().minusYears(40)));
    }

    public List<User> findAll() {
       return users; 
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
