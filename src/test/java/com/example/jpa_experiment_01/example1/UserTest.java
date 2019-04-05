package com.example.jpa_experiment_01.example1;

import com.example.jpa_experiment_01.example1.entity.User;
import com.example.jpa_experiment_01.example1.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserTest {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private UserRepository ur;

    @Test
    public void addUserTest() {
        ur.addUser("GT");
    }

    @Test
    public void addAddressTest() {
        ur.addAddress("101", em.find(User.class, 1));
        ur.addAddress("302", em.find(User.class, 1));
    }
}
