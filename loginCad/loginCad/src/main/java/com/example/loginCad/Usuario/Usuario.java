package com.example.loginCad.Usuario;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Table(name = "usuario")
@Entity(name = "usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "dateofbirth")
    private String dateofbirth;
    @Column(name = "password")
    private String password;


    public Usuario(DadosCadastroUsuario dados) {
        this.firstName = dados.firstName();
        this.lastName = dados.lastName();
        this.email = dados.email();
        this.dateofbirth = dados.dateofbirth();
        this.password = dados.password();
    }

    public void atualizar(DadosAtualizarUsuario dados){
        if (dados.firstName() != null){
            this.firstName = dados.firstName();
        }
        if (dados.lastName() != null){
            this.lastName = dados.lastName();
        }
        if (dados.email() != null){
            this.email = dados.email();
        }
        if (dados.password() != null){
            this.password = dados.password();
        }
        if (dados.dateofbirth() != null){
            this.dateofbirth = dados.dateofbirth();
        }
    }

}
