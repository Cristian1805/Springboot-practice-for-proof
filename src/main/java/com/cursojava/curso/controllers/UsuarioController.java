package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value= "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristhian");
        usuario.setApellido("Lozano");
        usuario.setEmail("cristianlozano@gmail.com");
        usuario.setTelefono("3152669239");
        return usuario;
    }

    @RequestMapping(value= "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1805L);
        usuario.setNombre("Cristhian");
        usuario.setApellido("Lozano");
        usuario.setEmail("cristianlozano@gmail.com");
        usuario.setTelefono("3152669239");



        Usuario usuario2 = new Usuario();
        usuario2.setId(1808L);
        usuario2.setNombre("Andrea ");
        usuario2.setApellido("Gallego");
        usuario2.setEmail("andreagallego@gmail.com");
        usuario2.setTelefono("3152415613");



        Usuario usuario3 = new Usuario();
        usuario3.setId(1305L);
        usuario3.setNombre("Laureano");
        usuario3.setApellido("Lozano");
        usuario3.setEmail("laureanolozano@gmail.com");
        usuario3.setTelefono("3152669239");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value= "usuario")
    public Usuario editar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Cristhian");
        usuario.setApellido("Lozano");
        usuario.setEmail("cristianlozano@gmail.com");
        usuario.setTelefono("3152669239");

        return usuario;
    }

    @RequestMapping(value= "usuario")
    public Usuario eliminar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Cristhian");
        usuario.setApellido("Lozano");
        usuario.setEmail("cristianlozano@gmail.com");
        usuario.setTelefono("3152669239");

        return usuario;
    }

    @RequestMapping(value= "usuario")
    public Usuario buscar(){

        Usuario usuario = new Usuario();
        usuario.setNombre("Cristhian");
        usuario.setApellido("Lozano");
        usuario.setEmail("cristianlozano@gmail.com");
        usuario.setTelefono("3152669239");

        return usuario;
    }
}
