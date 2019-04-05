package com.example.jpa_experiment_01.example1.repository;

import com.example.jpa_experiment_01.example1.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
@Slf4j
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void addUser(String name) {
        User user = new User(name);
        em.persist(user);
    }
    public void addAddress(String detail,User user){
        Address address=new Address(detail,user);
        em.persist(address);
    }
}
