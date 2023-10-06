package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.dto.User5DTO;
import kr.ch10.service.User5Service;

@RestController
public class User5Controller {

	@Autowired
	private User5Service service;
	
	@GetMapping("/user5")
	public List<User5DTO> list() {
		return service.selectUser5s();
	}
	@GetMapping("/user5/{name}")
	public User5DTO user5(@PathVariable("name") String name) {
		return service.selectUser5(name);
	}
	@PostMapping("/user5")
	public void register(User5DTO dto) {
		service.insertUser5(dto);
	}
	@PutMapping("/user5")
	public void modify(User5DTO dto) {
		service.updateUser5(dto);
	}
	@DeleteMapping("/user5/{name}")
	public void delete(@PathVariable("name") String name) {
		service.deleteUser5(name);
	}
}
