package br.com.fiap.Ecotrack.dto;

import jakarta.validation.constraints.NotBlank;

public record DicaCadastroDTO(

        @NotBlank(message = "Título obrigatório")
        String titulo,

        @NotBlank(message = "Descrição obrigatória")
        String descricao,

        @NotBlank(message = "Categoria obrigatória")
        String categoria
) {
}
