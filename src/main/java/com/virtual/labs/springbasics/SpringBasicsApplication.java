package com.virtual.labs.springbasics;

import com.virtual.labs.springbasics.persons.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao personJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("========= Find people -> {}", personJdbcDao.findAll());

        logger.info("========= Find people by id -> {}", personJdbcDao.findById(10001));

        logger.info("========= Find people by name -> {}", personJdbcDao.findByName("Edward"));

        logger.info("========= Find people by location -> {}", personJdbcDao.findByLocation("California"));
    }
}
