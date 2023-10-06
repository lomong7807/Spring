package kr.ch10.dto;

import kr.ch10.entity.User5Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User5DTO {

	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User5Entity toEntity() {
		
		return User5Entity.builder()
						.name(name)
						.gender(gender)
						.age(age)
						.addr(addr)
						.build();
						
	}
}
