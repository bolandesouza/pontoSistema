package com.example.demo.service;

import com.example.demo.enterprise.ValidationException;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario) {
        if(usuario.getNome().length() < 3){
            throw new ValidationException("O nome deve ter mais de 3 caracteres!");
        }
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){return usuarioRepository.findAll(); }

    public Optional<Usuario> getById(Long idUsuario){return usuarioRepository.findById(idUsuario);}

    public Usuario updaUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long idUsuario){usuarioRepository.deleteById(idUsuario);}



}
