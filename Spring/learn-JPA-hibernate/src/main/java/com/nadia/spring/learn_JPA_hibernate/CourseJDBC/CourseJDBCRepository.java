
package com.nadia.spring.learn_JPA_hibernate.CourseJDBC;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nadia.spring.learn_JPA_hibernate.Course.Course;


@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into Course (id, name, author)
            values(?, ?, ?);
            """;
     private static String DELETE_QUERY = """
                delete from Course
                where id = ?;       
                """;

    private static String SELECT_QUERY =
            """
            select * from Course
            where id = ?;
            """;

        
    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(int id) {
        jdbcTemplate.update(DELETE_QUERY, id);  
    }


    // resultSet->Bean(Course)->RowMapper(BeanPropertyRowMapper(Bean.class) )
    // BeanPropertyRowMapper->match column with properties of the bean
    // queryForObject-> expect only one object
    // first parameter-> SQL query
    // second parameter-> RowMapper
    // third parameter-> SQL parameter value
    // return type-> Course

    public Course findById( int id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);

    }

   
}
