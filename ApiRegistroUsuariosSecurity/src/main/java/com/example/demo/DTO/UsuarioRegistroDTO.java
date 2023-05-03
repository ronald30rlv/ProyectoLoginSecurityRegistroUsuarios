package com.example.demo.DTO;

public class UsuarioRegistroDTO {
	private Long idUsuario;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String celular;
    private String email;
    private String password;
    
    //Creando los Constructores    
    public UsuarioRegistroDTO() {
		super();
	}
	public UsuarioRegistroDTO(Long idUsuario, String nombre, String apePaterno, String apeMaterno, String celular,
			String email, String password) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.celular = celular;
		this.email = email;
		this.password = password;
	}    
	public UsuarioRegistroDTO(String nombre, String apePaterno, String apeMaterno, String celular, String email,
			String password) {
		super();
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.celular = celular;
		this.email = email;
		this.password = password;
	}
	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
	}
	//Generando los Getters and Setters

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
