package com.cebem.demo.controllers;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

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

    //TODO validaciones
    @PostMapping("/api/users")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario){
        return service.guardar(nuevoUsuario);
    }

    @DeleteMapping("/users/(id)")
    void borrarUsuario(@PathVariable Long id){
        service.borrarUsuario(id);
    }

    @PutMapping("/users/(id)")
    public Usuario modificarUsuario(@PathVariable Long id,
                                    @RequestBody Usuario usuario){
        return service.modificarUsuario(id, usuario);
    }
}
