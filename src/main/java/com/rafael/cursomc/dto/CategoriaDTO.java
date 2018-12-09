package com.rafael.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import com.rafael.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(message="O nome de ter de 5 a 80 caracteres")
	private String Nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		Id = obj.getId();
		Nome = obj.getNome();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
}
