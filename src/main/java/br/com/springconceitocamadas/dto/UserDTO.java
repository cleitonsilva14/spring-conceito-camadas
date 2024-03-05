package br.com.springconceitocamadas.dto;

import br.com.springconceitocamadas.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public UserDTO(User user) {
		super();
		id = user.getId();
		name = user.getName();
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
