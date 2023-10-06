package kr.ch10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.ch10.dto.User5DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "USER5")
public class User5Entity {

	@Id
	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User5DTO toDTO() {
		
		return User5DTO.builder()
						.name(name)
						.gender(gender)
						.age(age)
						.addr(addr)
						.build();
	}
}
