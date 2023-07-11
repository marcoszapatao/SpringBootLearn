package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuariodao;

    @RequestMapping(value="api/usuarios/{id}", method= RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Marcvos");
        usuario.setApellido("Zapata");
        usuario.setEmail("MZ@GMAIL.COM");
        usuario.setTelefono("899789788");
        return usuario;
    }

    @RequestMapping(value="api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuariodao.getUsuarios();
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

    @RequestMapping(value="api/usuarios/{id}", method= RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuariodao.eliminar(id);
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
