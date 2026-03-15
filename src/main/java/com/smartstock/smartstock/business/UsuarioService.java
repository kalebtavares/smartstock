package com.smartstock.smartstock.business;

import com.smartstock.smartstock.infrastructure.entity.Usuario;
import com.smartstock.smartstock.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario(Usuario usuario) {

        try {

            return usuarioRepository.save(usuario);

        } catch () {

        }
    }
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }
}
