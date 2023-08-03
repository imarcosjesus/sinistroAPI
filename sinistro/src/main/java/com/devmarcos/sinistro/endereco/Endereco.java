package com.devmarcos.sinistro.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public Endereco (DadosEndereco dadosEndereco){
        this.pais = dadosEndereco.pais();
        this.estado = dadosEndereco.estado();
        this.cidade =dadosEndereco.cidade();
        this.bairro = dadosEndereco.bairro();
        this.rua = dadosEndereco.rua();
        this.numero = dadosEndereco.numero();
    }
}
