package com.movieticketsys.userservice.model;

import jakarta.persistence.*;
import lombok.Data;

// TODO: Add jpa validations to columns.
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column
    private String address;

    @Column(name = "mobile_num", nullable = false)
    private String mobileNumber;
}
