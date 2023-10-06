package kr.ch10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.ch10.dto.User4DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "USER4")
public class User4Entity {

	@Id
	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User4DTO toDTO() {
		
		return User4DTO.builder()
						.name(name)
						.gender(gender)
						.age(age)
						.addr(addr)
						.build();
	}
}
