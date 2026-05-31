package br.com.fiap.Ecotrack.dto;

import br.com.fiap.Ecotrack.model.DicaESG;

public record DicaExibicaoDTO(
        Long idDica,
        String titulo,
        String descricao,
        String categoria
) {

    public DicaExibicaoDTO(DicaESG dica) {
        this(
                dica.getIdDica(),
                dica.getTitulo(),
                dica.getDescricao(),
                dica.getCategoria()
        );
    }
}
