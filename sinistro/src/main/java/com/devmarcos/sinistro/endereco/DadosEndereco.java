package com.devmarcos.sinistro.endereco;

import jakarta.validation.constraints.NotBlank;
public record DadosEndereco(
        @NotBlank
        String pais,
        @NotBlank
        String estado,
        @NotBlank
        String cidade,
        @NotBlank
        String bairro,
        @NotBlank
        String rua,
        @NotBlank
        String numero) {
}
