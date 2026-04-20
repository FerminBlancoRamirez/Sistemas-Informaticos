package com.cebem.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String email;
    //public String password;             se almacena de forma encriptada
}
