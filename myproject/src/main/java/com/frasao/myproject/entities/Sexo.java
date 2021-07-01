package com.frasao.myproject.entities;

public enum Sexo {
	F("FEMININO"), //0
	M("MASCULINO"); //1
	private String nome;
	private Sexo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	

}
