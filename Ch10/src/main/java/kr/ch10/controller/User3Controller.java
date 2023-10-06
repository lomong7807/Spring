package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.dto.User3DTO;
import kr.ch10.service.User3Service;

@RestController
public class User3Controller {

	@Autowired
	private User3Service service;
	
	@GetMapping("/user3")
	public List<User3DTO> list() {
		return service.selectUser3s();
	}
	
	@GetMapping("/user3/{name}")
	public User3DTO user3(@PathVariable("name") String name) {
		return service.selectUser3(name);
	}
	
	@PostMapping("/user3")
	public void register(User3DTO dto) {
		service.insertUser3(dto);
	}
	
	@PutMapping("/user3")
	public void modify(User3DTO dto) {
		service.updateUser3(dto);
	}
	
	@DeleteMapping("/user3/{name}")
	public void delete(@PathVariable("name") String name) {
		service.deleteUser3(name);
	}
	
}
