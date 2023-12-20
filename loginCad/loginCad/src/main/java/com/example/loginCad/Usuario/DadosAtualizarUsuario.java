package com.example.loginCad.Usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarUsuario(@NotNull Integer id, String firstName, String lastName, String email, String password, String dateofbirth) {
}
