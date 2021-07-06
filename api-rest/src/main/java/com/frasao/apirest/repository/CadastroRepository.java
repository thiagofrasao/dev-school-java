package com.frasao.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frasao.apirest.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

	Optional<Cadastro> findById(Integer id);
	
}