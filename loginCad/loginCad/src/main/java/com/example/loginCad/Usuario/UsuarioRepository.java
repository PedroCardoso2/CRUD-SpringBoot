package com.example.loginCad.Usuario;

import com.example.loginCad.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

