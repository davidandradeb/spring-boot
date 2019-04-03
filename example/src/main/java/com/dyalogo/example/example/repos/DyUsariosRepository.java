package com.dyalogo.example.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dyalogo.example.example.bdr.DyUsuarios;

public interface DyUsariosRepository extends JpaRepository<DyUsuarios, Integer>{
	List<DyUsuarios> findByNombre(String nombre);
}
