package com.cebem.demo.controllers;

import com.cebem.demo.service.RickAndMortyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class RickAndMortyController {
    private final RickAndMortyService servicio;
    @GetMapping("/personajes")
    public Object getPersonajes(){
        return servicio.getPersonajesVivos();
    }
}
