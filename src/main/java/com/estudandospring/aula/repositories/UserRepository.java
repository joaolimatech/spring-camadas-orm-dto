package com.estudandospring.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandospring.aula.entities.User;
//objeto de acesso a dados					recebe   <entity, id>
public interface UserRepository extends JpaRepository<User, Long>{

}
