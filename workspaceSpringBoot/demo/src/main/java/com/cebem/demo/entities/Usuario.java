package com.cebem.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Usuario {
    //esto es una representacion de las tablas que hay en la base de datos
    //validaciones
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String name;
    protected String email;
    protected String password;
    //public String password;             se almacena de forma encriptada

    public Usuario(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password=password;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
