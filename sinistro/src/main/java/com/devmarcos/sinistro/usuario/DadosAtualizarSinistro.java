package com.devmarcos.sinistro.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarSinistro (
        @NotNull
        long id,
        String sinistro){
}
