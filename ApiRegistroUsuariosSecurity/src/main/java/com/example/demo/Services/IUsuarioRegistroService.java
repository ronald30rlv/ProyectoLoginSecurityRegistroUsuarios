package com.example.demo.Services;

import com.example.demo.DTO.UsuarioRegistroDTO;
import com.example.demo.Entity.Usuario;

public interface IUsuarioRegistroService {
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
}
