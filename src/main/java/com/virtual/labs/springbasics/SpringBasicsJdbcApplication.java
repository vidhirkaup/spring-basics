package com.virtual.labs.springbasics;

import com.virtual.labs.springbasics.persons.entity.Person;
import com.virtual.labs.springbasics.persons.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

//@SpringBootApplication
public class SpringBasicsJdbcApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao personJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("========= Find people -> {}", personJdbcDao.findAll());

        logger.info("========= Find people by id(10001) -> {}", personJdbcDao.findById(10001));

        logger.info("========= Find people by name(Edward) -> {}", personJdbcDao.findByName("Edward"));

        logger.info("========= Find people by location(California) -> {}", personJdbcDao.findByLocation("California"));

        logger.info("========= Delete people by id(10002) -> Deleted {}", personJdbcDao.deleteById(10002));

        logger.info("========= Delete people by id(10008) -> Deleted {}", personJdbcDao.deleteById(10008));

        logger.info("========= Delete people by id(10003 OR California) -> Deleted {}", personJdbcDao.deleteByIdOrLocation(10003, "California"));

        logger.info("========= Insert people -> Inserted {}", personJdbcDao.insert(new Person(10007, "Frank", "Toronto", new Date(System.currentTimeMillis()))));

        logger.info("========= Update people -> Updated {}", personJdbcDao.update(new Person(10001, "Alice", "Vancover", new Date(System.currentTimeMillis()))));
    }
}
