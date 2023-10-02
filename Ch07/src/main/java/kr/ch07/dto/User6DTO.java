package kr.ch07.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class User6DTO {

	private String uid;
	private String name;
	private String birth;
	private String gender;
	private int age;
	private String addr;
	private String hp;
}
