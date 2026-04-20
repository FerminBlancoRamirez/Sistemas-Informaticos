package com.cebem.demo.models;

import java.util.ArrayList;

public class Usuario {
    public int id;
    public String nombre;

    public ArrayList<Integer> post=new ArrayList();

    public Usuario(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
}
