package br.com.springconceitocamadas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.springconceitocamadas.dto.UserDTO;
import br.com.springconceitocamadas.entities.User;
import br.com.springconceitocamadas.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	// Esse metodo chama findById do UserRepository
	// e retorno o DTO para o Controller
	
	@Transactional(readOnly = true) // apenas para operações de leitura
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).get(); // O .get() acessa o objeto dentro do Optional
		UserDTO dto = new UserDTO(entity);  //transforma o entity em DTO
		return dto; // retorna o dto para o Controller
	}
	
}
