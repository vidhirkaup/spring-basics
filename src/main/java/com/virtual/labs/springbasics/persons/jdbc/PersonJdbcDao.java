package com.virtual.labs.springbasics.persons.jdbc;

import com.virtual.labs.springbasics.persons.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public List<Person> findByName(String name) {
        return jdbcTemplate.query("select * from person where name=?",
                new Object[] {name},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public List<Person> findByLocation(String location) {
        return jdbcTemplate.query("select * from person where location=?",
                new Object[] {location},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?",
                new Object[]{id});
    }

    public int deleteByIdOrLocation(int id, String location) {
        return jdbcTemplate.update("delete from person where id=? or location=?",
                new Object[]{id, location});
    }
}
