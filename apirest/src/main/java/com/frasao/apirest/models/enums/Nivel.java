package com.frasao.apirest.models.enums;

public enum Nivel {

		IN("INICIANTE"),
		BA("BASICO"),
		IT("INTERMEDIARIO"),
		AV ("AVANCADO");
		
		private String descricao;
		private Nivel(String descricao) {
			this.descricao = descricao;
		}
		public String getDescricao() {
			return descricao;
		}
	}
