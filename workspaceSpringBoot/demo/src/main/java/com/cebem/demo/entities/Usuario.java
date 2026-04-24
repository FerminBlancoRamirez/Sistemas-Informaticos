package com.cebem.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {
    //esto es una representacion de las tablas que hay en la base de datos
    //validaciones
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, message = "El nombre minimo con dos caracteres")
    private String name;
    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Tienes que poner un formato email")
    private String email;
    private String password;
    //public String password;             se almacena de forma encriptada
}
