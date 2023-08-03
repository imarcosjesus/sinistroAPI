package com.devmarcos.sinistro.repository;

import com.devmarcos.sinistro.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
