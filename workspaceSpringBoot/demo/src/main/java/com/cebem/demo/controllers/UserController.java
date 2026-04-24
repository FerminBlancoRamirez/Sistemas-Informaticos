package com.cebem.demo.controllers;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    //inyeccion de dependencias
    private final UserService service;
    /*public UserController(UserService service){
        this.service=service;
    }*/  //si uso una notacion de lombok esto ya no es necesario

    //http://localhost:8080/users
    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios(){
        //UserService service=new UserService();
        return service.getAllUsers();
    }

    //TODO validaciones
    @PostMapping
    public Usuario crearUsuario(@RequestBody @Valid Usuario nuevoUsuario){
        return service.guardar(nuevoUsuario);
    }

    @DeleteMapping("/(id)")
    void borrarUsuario(@PathVariable Long id){
        service.borrarUsuario(id);
    }

    @PutMapping("/(id)")
    public Usuario modificarUsuario(@PathVariable Long id,
                                    @RequestBody @Valid Usuario usuario){
        return service.modificarUsuario(id, usuario);
    }
}
