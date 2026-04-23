package com.cebem.demo.service;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Usuario modificarUsuario(Long id, Usuario usuario){
        Optional<Usuario> userAModificar=repository.findById(id);
        if (userAModificar.isPresent()) {
            userAModificar.setEmail(usuario.getEmail());
            userAModificar.setName(usuario.getName());
            repository.save(userAModificar);
        }else {
            throw new RuntimeException("El usuario no existe");
        }
    }
}
