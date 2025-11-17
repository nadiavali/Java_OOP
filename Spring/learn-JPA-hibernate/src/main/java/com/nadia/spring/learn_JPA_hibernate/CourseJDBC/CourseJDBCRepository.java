
package com.nadia.spring.learn_JPA_hibernate.CourseJDBC;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into Course (id, name, author)
            values(1, 'Learn AWS JPA Hibernate', 'Nadia');
            """;

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
}
