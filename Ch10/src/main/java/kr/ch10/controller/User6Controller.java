package kr.ch10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ch10.dto.User6DTO;
import kr.ch10.service.User6Service;

@RestController
public class User6Controller {

	@Autowired
	private User6Service service;
	
	@GetMapping("/user6")
	public List<User6DTO> list() {
		return service.selectUser6s();
	}
	@GetMapping("/user6/{seq}")
	public User6DTO user6(@PathVariable("seq") int seq) {
		return service.selectUser6(seq);
	}
	@PostMapping("/user6")
	public void register(User6DTO dto) {
		service.insertUser6(dto);
	}
	@PutMapping("/user6")
	public void modify(User6DTO dto) {
		service.updateUser6(dto);
	}
	@DeleteMapping("/user6/{seq}")
	public void delete(@PathVariable("seq") int seq) {
		service.deleteUser6(seq);
	}
}
