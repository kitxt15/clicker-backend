package com.justahead.kvantbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {


    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "balance")
    private int balance;

    @Column(name = "location")
    private String location;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "finger_amount")
    private int finger_amount;





    public User() {

    }


}
