package kr.ch10.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User4DTO;
import kr.ch10.entity.User4Entity;
import kr.ch10.repository.User4Repository;

@Service
public class User4Service {

	@Autowired
	private User4Repository repo;
	
	public void insertUser4(User4DTO dto) {
		User4Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public User4DTO selectUser4(String name) {
		Optional<User4Entity> result = repo.findById(name);
		
		User4DTO dto = result.get().toDTO();
		return dto;
	}
	public List<User4DTO> selectUser4s() {
		return repo.findAll()
							.stream()
							.map(entity -> User4DTO.builder()
													.name(entity.getName())
													.gender(entity.getGender())
													.age(entity.getAge())
													.addr(entity.getAddr())
													.build())
							.collect(Collectors.toList());
	}
	public void updateUser4(User4DTO dto) {
		User4Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public void deleteUser4(String name) {
		repo.deleteById(name);
	}
}
