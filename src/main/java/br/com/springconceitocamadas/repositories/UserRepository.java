package br.com.springconceitocamadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springconceitocamadas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
