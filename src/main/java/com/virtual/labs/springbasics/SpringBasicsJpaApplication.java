package com.virtual.labs.springbasics;

import com.virtual.labs.springbasics.persons.entity.Person;
import com.virtual.labs.springbasics.persons.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class SpringBasicsJpaApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("========= Find people -> {}", personJpaRepository.findAll());

        logger.info("========= Find people by id(10001) -> {}", personJpaRepository.findById(10001));

//        logger.info("========= Find people by name(Edward) -> {}", personJdbcDao.findByName("Edward"));

//        logger.info("========= Find people by location(California) -> {}", personJdbcDao.findByLocation("California"));

        logger.info("========= Delete people by id(10002) -> Deleted {}");
        personJpaRepository.deleteById(10002);

//        logger.info("========= Delete people by id(10008) -> Deleted {}", personJdbcDao.deleteById(10008));

//        logger.info("========= Delete people by id(10003 OR California) -> Deleted {}", personJdbcDao.deleteByIdOrLocation(10003, "California"));

        logger.info("========= Insert people -> Inserted {}", personJpaRepository.insert(new Person("Frank", "Toronto", new Date(System.currentTimeMillis()))));
        logger.info("========= Insert people -> Inserted {}", personJpaRepository.insert(new Person("Grace", "Edmonton", new Date(System.currentTimeMillis()))));

        logger.info("========= Update people -> Updated {}", personJpaRepository.update(new Person(10001, "Alice", "Regina", new Date(System.currentTimeMillis()))));

        logger.info("========= Find people -> {}", personJpaRepository.findAll());
    }
}
