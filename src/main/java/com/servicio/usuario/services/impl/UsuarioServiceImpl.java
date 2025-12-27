package com.servicio.usuario.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.usuario.entity.Usuario;
import com.servicio.usuario.exceptions.ResourceNotFoundException;
import com.servicio.usuario.repository.UsuarioRepository;
import com.servicio.usuario.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override//guardar un usuario
	public Usuario saveUsuario(Usuario usuario) {
		String randomUsuarioId = UUID.randomUUID().toString();
		usuario.setUsuarioId(randomUsuarioId);
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuario(String usuarioId) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(usuarioId).orElseThrow(()-> new ResourceNotFoundException("Usurio no encontrado con el Id"+usuarioId));
	}
	
}
