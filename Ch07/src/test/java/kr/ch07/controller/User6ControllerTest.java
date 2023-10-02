package kr.ch07.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import kr.ch07.service.User6Service;

@WebMvcTest(controllers = User6Controller.class)
public class User6ControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private User6Service service;
	
	// each는 static 빠짐
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll...");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach...");
	}
	@AfterAll
	public static void AfterAll() {
		System.out.println("AfterAll...");
	}
	@AfterEach
	public void AfterEach() {
		System.out.println("AfterEach...");
	}
	
	
	@Test
	public void list() throws Exception {
		
		mvc
			.perform(get("/user6/list"))				// index 요청 테스트
			.andExpect(status().isOk())					// 요청 결과 상태 테스트
			.andExpect(view().name("/user6/list")) 		// 반환되는 View 이름 테스트
			.andDo(print());							// 요청 테스트 결과 출력
		
		
		System.out.println("list test...");
	}
}
