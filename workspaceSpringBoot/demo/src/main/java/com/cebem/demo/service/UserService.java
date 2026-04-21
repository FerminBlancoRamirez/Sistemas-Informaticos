package com.cebem.demo.service;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  UserService {
    //inyeccion de dependencias
    private final UserRepository repository;
    public UserService(UserRepository repository){
        this.repository=repository;
    }
    public List<Usuario> getAllUsers(){
        return repository.findAll();
    }

    public Usuario guardar(Usuario nuevoUsuario){
        return repository.save(nuevoUsuario);
    }

    public void borrarUsuario(Long id){
        repository.deleteById(id);
    }
}
