package com.cebem.demo.controllers;

import com.cebem.demo.models.LuzModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    //http://localhost:8080/encender
    @GetMapping("/encender")
    public String encender(){
        return "Luz encendida";
    }

    //http://localhost:8080/apagar/34
    @GetMapping("/apagar/{numLuz}")
    public String apagar(@PathVariable long numLuz){
        return "Luz "+numLuz+" apagada";
    }

    //http://localhost:8080/estado?lugar=salon&nombre=luz1
    @GetMapping("/estado")
    public String verEstado(
            @RequestParam String lugar,
            @RequestParam String nombre){
        return "La "+nombre+" esta en "+lugar;
    }

    @PostMapping("/crearLuz")
    public String crearLuzNueva(@RequestBody LuzModel nuevaLuz){
        return "Luz nueva creada: "+nuevaLuz.nombre+" "+nuevaLuz.localizacion;
    }

    // Hacer un endpoint al que le pases un número (como parametro) y te diga si es par o impar
    // GET http://localhost:8080/es_par/XXX  -->   si XXX es par o impar
    @GetMapping("/es_par/{numero}")
    public String parOImpar(@PathVariable int numero){
        if (numero%2==0)
            return "es par";
        else
            return "es impar";
    }

    // Hacer un endpoint al que le pases 2 numeros (como query params) y los multiplique
    // GET http://localhost:8080/multiplicar?num1=xxx&num2=yyy      -->    xxx * yyy
    @GetMapping("/multiplicar")
    public String multiplicacion(@RequestParam int num1, @RequestParam int num2){
        int multiplicacion=num1*num2;
        return "La multiplicacion de "+num1+" y "+num2+" es: "+multiplicacion;
    }

    // Hacer un endpoint que dado un usuario borre un post del mismo
    // DELETE http://localhost:8080/usuario/XXX/post/YYY    --> Borra el post YYY del usuario XXX
    @DeleteMapping("/usuarios/{usuarioId}/posts/{postId}")
    public String borrarPostDeUsuario(@PathVariable int usuarioId, @PathVariable int postId) {
        return "Acción realizada: El usuario con ID " + usuarioId + " ha eliminado su post con ID " + postId;
    }

}
