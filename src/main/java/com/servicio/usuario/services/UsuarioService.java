package com.servicio.usuario.services;

import java.util.List;

import com.servicio.usuario.entity.Usuario;

public interface UsuarioService {

	//metodos 
	
	//metodo de guardar usuario
	Usuario saveUsuario(Usuario usuario);
	
	//listar todos los usuarios
	List<Usuario> getAllUsuarios();
	
	//llamar a un usuario
	Usuario getUsuario(String usuarioId);
	
}
