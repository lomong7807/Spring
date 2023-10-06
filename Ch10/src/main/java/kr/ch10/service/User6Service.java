package kr.ch10.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User6DTO;
import kr.ch10.entity.User6Entity;
import kr.ch10.repository.User6Repository;

@Service
public class User6Service {

	@Autowired
	private User6Repository repo;
	

	public void insertUser6(User6DTO dto) {
		User6Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public User6DTO selectUser6(int seq) {
		Optional<User6Entity> result = repo.findById(seq);
		
		User6DTO dto = result.get().toDTO();
		return dto;
	}
	public List<User6DTO> selectUser6s() {
		return repo.findAll()
							.stream()
							.map(entity -> User6DTO.builder()
													.seq(entity.getSeq())
													.name(entity.getName())
													.gender(entity.getGender())
													.age(entity.getAge())
													.addr(entity.getAddr())
													.build())
							.collect(Collectors.toList());
	}
	public void updateUser6(User6DTO dto) {
		User6Entity entity = dto.toEntity();
		repo.save(entity);
	}
	public void deleteUser6(int seq) {
		repo.deleteById(seq);
	}
}
