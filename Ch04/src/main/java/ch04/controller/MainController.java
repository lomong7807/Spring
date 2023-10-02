package ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	// 주소, 메서드, 리턴값 이름 통일 시키는게 보기 좋음
	@RequestMapping(value = {"/", "/index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting";
	}

	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/annotation/param";
	}
	@GetMapping("/forward")
	public String forward() {
		return "forward:/annotation/model";
	}
}
