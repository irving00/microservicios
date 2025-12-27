package com.servicio.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.usuario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
