package com.devmarcos.sinistro.usuario;

import com.devmarcos.sinistro.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String carro;
    private String placa;
    private String sinistro;

    @Embedded
    private Endereco endereco;

    public Usuario(DadosCadastroUsuario dadosusuario){
        this.nome = dadosusuario.nome();
        this.carro = dadosusuario.carro();
        this.placa = dadosusuario.placa();
        this.sinistro = dadosusuario.sinistro();
        this.endereco = new Endereco(dadosusuario.endereco());
    }

    public void atualizarsinistro(DadosAtualizarSinistro dadosusuario) {
        this.sinistro = dadosusuario.sinistro();
    }
}
