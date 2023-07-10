package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Juan");
        usuario2.setApellido("Zapata");
        usuario2.setEmail("rt@GMAIL.COM");
        usuario2.setTelefono("2323232");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Martin");
        usuario3.setApellido("fernandex");
        usuario3.setEmail("df@GMAIL.COM");
        usuario3.setTelefono("89789788");

        Usuario usuario4 = new Usuario();
        usuario4.setId(4L);
        usuario4.setNombre("Felipe");
        usuario4.setApellido("Solis");
        usuario4.setEmail("rf@GMAIL.COM");
        usuario4.setTelefono("899781118");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }

    @RequestMapping(value="editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");
        return usuario;
    }

    @RequestMapping(value="eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");
        return usuario;
    }

    @RequestMapping(value="buscar")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");
        return usuario;
    }
}
