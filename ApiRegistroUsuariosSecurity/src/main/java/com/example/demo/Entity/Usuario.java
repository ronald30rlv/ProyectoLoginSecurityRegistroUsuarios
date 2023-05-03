package com.example.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.JoinColumn;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="usuarios",uniqueConstraints = @UniqueConstraint(columnNames = "email")) //Estamos indicando que el campo de la columna email es unico
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String celular;
    private String email;
    private String password;
    //Recuerda que el Usuario debe tener un Rol, 
    //Tambien recuerda que muchos usuarios pueden tener muchos roles
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="usuarios_roles",joinColumns = @JoinColumn(name="usuario_id",referencedColumnName = "idUsuario"),
                inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "idRol"))
    private Collection<Rol> roles;	
    
    
    //Creando los constructores
    public Usuario(Long idUsuario, String nombre, String apePaterno, String apeMaterno, String celular, String email,
			String password, Collection<Rol> roles) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.celular = celular;
		this.email = email;
		this.password = password;
		this.roles = roles;		
	}   
    
    public Usuario(String nombre, String apePaterno, String apeMaterno, String celular, String email, String password,
			Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.celular = celular;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}   

	public Usuario() {
		super();
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
	public Collection<Rol> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}
    
}
