package com.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este campo não pode ficar em branco.")
	@Size(min = 2, max = 100, message = "O campo nome deve conter, no mínimo, 2 caracteres e, no máximo, 100.")
	private String nome;
	
	@NotBlank(message = "Este campo não pode ficar em branco.")
	@Size(min = 5, max = 100, message = "O campo usuário deve conter, no mínimo, 5 caracteres e, no máximo, 100.")
	@Email
	private String usuario;
	
	@NotBlank(message = "Este campo não pode ficar em branco.")
	@Size(min = 5, max = 100, message = "Sua senha deve conter, no mínimo, 5 caracteres e, no máximo, 100.")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
