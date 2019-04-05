package com.example.jpa_experiment_01.example2;

import com.example.jpa_experiment_01.example2.entity.*;
import com.example.jpa_experiment_01.example2.repository.ElectiveRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ElectiveTest {
    @Autowired
    private ElectiveRepository er;
    @Test
    public void test_elective_success(){
        Student student1=er.addStudent("Mark");
        Course course1=er.addCourse("Math");
        Course course2=er.addCourse("Music");
        er.addElective(student1, course1);
        er.addElective(student1, course2);
    }
}
