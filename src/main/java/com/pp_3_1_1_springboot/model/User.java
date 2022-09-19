package com.pp_3_1_1_springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userss")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;
}
