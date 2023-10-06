package kr.ch10.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User5DTO;
import kr.ch10.entity.User5Entity;
import kr.ch10.repository.User5Repository;

@Service
public class User5Service {

	@Autowired
	private User5Repository repo;
	

	public void insertUser5(User5DTO dto) {
		User5Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public User5DTO selectUser5(String name) {
		Optional<User5Entity> result = repo.findById(name);
		
		User5DTO dto = result.get().toDTO();
		return dto;
	}
	public List<User5DTO> selectUser5s() {
		return repo.findAll()
							.stream()
							.map(entity -> User5DTO.builder()
													.name(entity.getName())
													.gender(entity.getGender())
													.age(entity.getAge())
													.addr(entity.getAddr())
													.build())
							.collect(Collectors.toList());
	}
	public void updateUser5(User5DTO dto) {
		User5Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public void deleteUser5(String name) {
		repo.deleteById(name);
	}
}
