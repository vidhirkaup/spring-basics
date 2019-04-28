package com.virtual.labs.springbasics.persons.jpa;

import com.virtual.labs.springbasics.persons.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    @SuppressWarnings("JpaQueryApiInspection")
    public List<Person> findAll() {
        TypedQuery<Person> find_all_persons = entityManager.createNamedQuery("find_all_persons", Person.class);
        return find_all_persons.getResultList();
    }

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public Person update(Person person){
        return entityManager.merge(person);
    }
}
