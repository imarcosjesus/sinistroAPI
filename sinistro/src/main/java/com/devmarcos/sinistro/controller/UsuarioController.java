package com.devmarcos.sinistro.controller;

import com.devmarcos.sinistro.repository.UsuarioRepository;
import com.devmarcos.sinistro.usuario.DadosAtualizarSinistro;
import com.devmarcos.sinistro.usuario.DadosCadastroUsuario;
import com.devmarcos.sinistro.usuario.DadosListagemUsuario;
import com.devmarcos.sinistro.usuario.Usuario;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dadosUsuario){
        repository.save(new Usuario(dadosUsuario));
    }

    @GetMapping
    public List<DadosListagemUsuario> listar(){
        return repository.findAll().stream().map(DadosListagemUsuario::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarSinistro dadosSinistro){
        var usuario = repository.getReferenceById(dadosSinistro.id());
        usuario.atualizarsinistro(dadosSinistro);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }

}
