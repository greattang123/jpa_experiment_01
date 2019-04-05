package com.example.jpa_experiment_01.example2.entity;

import com.example.jpa_experiment_01.example2.relationship.Elective;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    @OneToMany(mappedBy = "student")
    private List<Elective> electives;
    public Student(String name){
        this.name=name;
    }
}
