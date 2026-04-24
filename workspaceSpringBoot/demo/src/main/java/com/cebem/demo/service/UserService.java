package com.cebem.demo.service;

import com.cebem.demo.entities.Usuario;
import com.cebem.demo.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class  UserService {
    //inyeccion de dependencias
    private final UserRepository repository;
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
            Usuario usuarioOpcional= userAModificar.get();
            usuarioOpcional.setEmail(usuario.getEmail());
            usuarioOpcional.setName(usuario.getName());
            return repository.save(usuarioOpcional);
        }else {
            throw new RuntimeException("El usuario no existe");
        }
    }
}
