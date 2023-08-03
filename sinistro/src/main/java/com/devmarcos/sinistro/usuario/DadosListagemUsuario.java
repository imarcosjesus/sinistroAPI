package com.devmarcos.sinistro.usuario;

public record DadosListagemUsuario(Long id,String nome,String carro,String placa,String sinistro) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getCarro(), usuario.getPlaca(), usuario.getSinistro());
    }
}
