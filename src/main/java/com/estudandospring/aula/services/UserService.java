package com.estudandospring.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandospring.aula.dto.UserDTO;
import com.estudandospring.aula.entities.User;
import com.estudandospring.aula.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public UserDTO findById(Long id) {
	 User entity =	repository.findById(id).get();
	 UserDTO dto = new UserDTO(entity); /*objeto entity é o retorno da busca do repository, Q vem com todos campos da tabela.
	 Ao instaciar o DTO, o construtor recebe a entity e pega apenas o Id e o nome, nao precisamos da senha no DTO */
	 return dto;
	}
}
