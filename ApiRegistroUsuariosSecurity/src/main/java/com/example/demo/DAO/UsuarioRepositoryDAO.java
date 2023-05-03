package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Usuario;

@Repository
public interface UsuarioRepositoryDAO extends JpaRepository<Usuario, Long>{
	//El JpaRepository ya viene con todas las implementaciondes del CRUD(save,delete,update)
}
