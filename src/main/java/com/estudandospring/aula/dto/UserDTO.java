package com.estudandospring.aula.dto;

import com.estudandospring.aula.entities.User;

//objeto de trafegar dados de usuario
public class UserDTO {

	private Long id;
	private String name;
	
	public UserDTO(){}

	public UserDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//construtor q recebe a entidade pra facilitar a conversao de entidade pra DTO
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
