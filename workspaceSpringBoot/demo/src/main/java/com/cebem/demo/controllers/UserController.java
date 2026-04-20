package com.cebem.demo.controllers;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    //inyeccion de dependencias
    private final UserService service;
    public UserController(UserService service){
        this.service=service;
    }

    //http://localhost:8080/users
    @GetMapping("/users")
    public List<Usuario> obtenerTodosLosUsuarios(){
        //UserService service=new UserService();
        return service.getAllUsers();
    }
}
