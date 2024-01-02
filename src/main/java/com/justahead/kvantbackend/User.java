package com.justahead.kvantbackend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Setter
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {


    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;


    @Column(name = "kvantamount")
    private int kvantAmount;



    public User() {

    }


}
