package com.example.demo.Services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.UsuarioRepositoryDAO;
import com.example.demo.DTO.UsuarioRegistroDTO;
import com.example.demo.Entity.Rol;
import com.example.demo.Entity.Usuario;

@Service
public class UsuarioRegistroImplement implements IUsuarioRegistroService {
	
	@Autowired
	private UsuarioRepositoryDAO usuarioRepository;
	
	@Override
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
		Usuario usuario=new Usuario(registroDTO.getNombre(), registroDTO.getApePaterno(), registroDTO.getApeMaterno(), 
				registroDTO.getCelular(), registroDTO.getEmail(), 
				registroDTO.getPassword(), Arrays.asList(new Rol("Role_User")));
		return usuarioRepository.save(usuario);
	}

}
