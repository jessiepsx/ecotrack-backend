package br.com.fiap.Ecotrack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AcaoCadastroDTO(

        @NotBlank(message = "Nome obrigatório")
        String nome,

        @NotBlank(message = "Descrição obrigatória")
        String descricao,

        @NotNull(message = "Pontuação obrigatória")
        Integer pontos
) {
}
