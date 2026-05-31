package br.com.fiap.Ecotrack.dto;

import br.com.fiap.Ecotrack.model.AcaoSustentavel;

public record AcaoExibicaoDTO(
        Long idAcao,
        String nome,
        String descricao,
        Integer pontos
) {

    public AcaoExibicaoDTO(AcaoSustentavel acao) {
        this(
                acao.getIdAcao(),
                acao.getNome(),
                acao.getDescricao(),
                acao.getPontos()
        );
    }
}
