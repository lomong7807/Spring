package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.dto.User4DTO;
import kr.ch10.service.User4Service;

@RestController
public class User4Controller {

	@Autowired
	private User4Service service;
	
	
	@GetMapping("/user4")
	public List<User4DTO> list() {
		return service.selectUser4s();
	}
	@GetMapping("/user4/{name}")
	public User4DTO user4(@PathVariable("name") String name) {
		return service.selectUser4(name);
	}
	@PostMapping("/user4")
	public void register(User4DTO dto) {
		service.insertUser4(dto);
	}
	@PutMapping("/user4")
	public void modify(User4DTO dto) {
		service.updateUser4(dto);
	}
	@DeleteMapping("/user4/{name}")
	public void delete(@PathVariable("name") String name) {
		service.deleteUser4(name);
	}
}
