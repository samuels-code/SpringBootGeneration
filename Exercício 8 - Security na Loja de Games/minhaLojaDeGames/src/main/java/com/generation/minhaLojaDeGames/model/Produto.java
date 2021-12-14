package com.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 255, message = "O nome deve conter no mínimo 5 caracteres.")
	private String nome;
	
	@NotBlank
	@Size(min = 20, max = 500, message = "A descrição deve conter no mínimo 20 caracteres.")
	private String descricao;
	
	@NotNull
	(message = "Digite aqui o preço do produto: ")
	private double preco;
	
	@NotNull
	(message = "Digite aqui a quantidade do produto: ")
	private long quantidade;
	
	@NotBlank
	@Size(min = 5, max = 255, message = "O gênero deve conter no mínimo 5 caracteres.")
	private String genero;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
