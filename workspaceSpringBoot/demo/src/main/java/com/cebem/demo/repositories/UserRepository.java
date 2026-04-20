package com.cebem.demo.repositories;

import com.cebem.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {


}

