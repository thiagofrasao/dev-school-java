package com.frasao.myproject.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Cadastro {
	
	@Id
	private Integer id;
	@Column(length = 50)
	private String nome;
	@Column(length = 20)
	private String rg;
	@Column(length = 14)
	private String cpf;
	@Column(name = "dt_nascimento")
	private Date dataNascimento;
	@Column(length = 20)
	private String nivel;
	@Enumerated(EnumType.STRING)
	@Column(length = 2)
	private String sexo;
	@Column(length = 50)
	private String nacionalidade;
	
	
		
}
