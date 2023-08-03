package com.devmarcos.sinistro.usuario;

import com.devmarcos.sinistro.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotBlank
        String nome,
        @NotBlank
        String carro,
        @NotBlank
        String placa,
        @NotBlank
        String sinistro,

        @NotNull @Valid DadosEndereco endereco) {
}
