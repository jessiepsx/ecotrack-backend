package br.com.fiap.Ecotrack.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginDTO(

        @Email
        @NotBlank
        String email,

        @NotBlank
        String senha
) {
}
