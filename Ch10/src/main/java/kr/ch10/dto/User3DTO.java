package kr.ch10.dto;

import kr.ch10.entity.User3Entity;
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
public class User3DTO {

	private String id;
	private String name;
	private String hp;
	private int age;
	
	public User3Entity toEntity() {
		
		return User3Entity.builder()
						  .id(id)
						  .name(name)
						  .hp(hp)
						  .age(age)
						  .build();
	}
}
