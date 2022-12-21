package com.example.SushiByAvans.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String usercode;
    private enum ROLE {
        ADMIN,
        USER
    }
}

