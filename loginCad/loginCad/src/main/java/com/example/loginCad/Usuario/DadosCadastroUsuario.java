package com.example.loginCad.Usuario;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(
        @NotBlank

        String firstName,
        @NotBlank

        String lastName,
        @NotBlank
        @Email

        String email,
        @NotBlank

        String password,
        @NotBlank
        @Pattern(regexp = "\\d{10}")

        String dateofbirth
) {
}
