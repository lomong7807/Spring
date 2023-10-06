package kr.ch10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import kr.ch10.dto.User6DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "USER6")
@SequenceGenerator(
        name="USER_SEQ_GEN", //시퀀스 제너레이터 이름
        sequenceName="SEQ_USER6", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1 //메모리를 통해 할당할 범위 사이즈
        )
public class User6Entity {

	@Id
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="USER_SEQ_GEN" //식별자 생성기를 설정해놓은  USER_SEQ_GEN으로 설정        
            )
	private int seq;
	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User6DTO toDTO() {
		
		return User6DTO.builder()
						.seq(seq)
						.name(name)
						.gender(gender)
						.age(age)
						.addr(addr)
						.build();
	}
}
