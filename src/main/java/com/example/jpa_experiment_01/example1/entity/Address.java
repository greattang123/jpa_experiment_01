package com.example.jpa_experiment_01.example1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String detail;
    @ManyToOne
    private User user;
    @Column(columnDefinition = "TIMESTAMP NOT NULL "+
            "DEFAULT CURRENT_TIMESTAMP",
            updatable=false,
            insertable = false)
    private LocalDateTime insertTime;
    public Address(String detail,User user){
        this.detail=detail;
        this.user=user;
    }
}
