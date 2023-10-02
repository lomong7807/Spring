package kr.ch07.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.ch07.dto.User6DTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class User6MapperTest {

	@Autowired
	private User6Mapper mapper;
	
	public void insertUser6() {
		
		User6DTO user6 = User6DTO.builder()
						.uid("a2222")
						.name("김춘추")
						.birth("2022-08-27")
						.gender("M")
						.age(89)
						.addr("부산")
						.hp("010-6666-6666")
						.build();
		mapper.insertUser6(user6);
	};
	
	@Test
	public void selectUser6s() {
		List<User6DTO> users = mapper.selectUser6s();
		
		for(User6DTO user : users) {
			log.info(user.toString());
		}
	}
	
}
