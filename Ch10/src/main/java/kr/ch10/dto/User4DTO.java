package kr.ch10.dto;

import kr.ch10.entity.User4Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User4DTO {

	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User4Entity toEntity() {
		
		return User4Entity.builder()
						.name(name)
						.gender(gender)
						.age(age)
						.addr(addr)
						.build();
						
	}
}
