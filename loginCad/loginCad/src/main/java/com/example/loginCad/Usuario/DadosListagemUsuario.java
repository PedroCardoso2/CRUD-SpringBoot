package com.example.loginCad.Usuario;

public record DadosListagemUsuario(Integer id,String first_name, String last_name,String email,String password) {
    public DadosListagemUsuario(Usuario md){
        this(md.getId(), md.getFirstName(), md.getEmail(), md.getLastName(), md.getDateofbirth());
    }

}
