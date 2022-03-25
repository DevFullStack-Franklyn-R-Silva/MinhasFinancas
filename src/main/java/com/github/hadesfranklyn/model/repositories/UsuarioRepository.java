package com.github.hadesfranklyn.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
