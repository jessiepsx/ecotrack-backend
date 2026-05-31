package br.com.fiap.Ecotrack.dto;

import br.com.fiap.Ecotrack.model.Usuario;

public record UsuarioExibicaoDTO(
        Long idUsuario,
        String nome,
        String email
) {

    public UsuarioExibicaoDTO(Usuario usuario) {
        this(
                usuario.getIdUsuario(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }
}
