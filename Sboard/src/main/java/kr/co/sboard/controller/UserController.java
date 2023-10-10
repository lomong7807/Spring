package kr.co.sboard.controller;

import kr.co.sboard.dto.TermsDTO;
import kr.co.sboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public String login(){
        return "/user/login";
    }

    @GetMapping("/user/terms")
    public String terms(Model model) {
        TermsDTO terms = userService.findByTerms();
        model.addAttribute(terms);

        return "/user/terms";
    }

    @GetMapping("/user/register")
    public String register() {
        return "/user/register";
    }


}
