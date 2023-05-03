package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTO.UsuarioRegistroDTO;
import com.example.demo.Services.IUsuarioRegistroService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioCOntroller {
	@Autowired
	private IUsuarioRegistroService usuarioRegistroService;
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	@GetMapping
	public String mostrarFormularioRegistro() {
		return "registro";
	}
	@PostMapping
	public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioRegistroService.guardarUsuario(registroDTO);
		return "redirect:/registro?exito";
	}
	/*
	@GetMapping
	  public String hola(Model modelo) {    
	    modelo.addAttribute("mensaje","hola desde thymeleaf");
	    return "hola";
	  }*/
}
