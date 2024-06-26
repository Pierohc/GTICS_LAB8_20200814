package com.example.lab8_20200814.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pokemon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private int encounterRate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}