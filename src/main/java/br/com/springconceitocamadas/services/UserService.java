package br.com.springconceitocamadas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springconceitocamadas.dto.UserDTO;
import br.com.springconceitocamadas.entities.User;
import br.com.springconceitocamadas.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
	
}
