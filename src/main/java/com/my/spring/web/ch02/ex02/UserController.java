package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02/ex02")
@RequestMapping("ch02/ex02")
public class UserController {
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	/*
	@PostMapping("userOut")
	public String userOut(@RequestParam String username,
			@RequestParam int age,
			@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
			Model model) {
		model.addAttribute("user",new User(username,age,regDate));
		return "ch02/ex02/userOut";
	}
	*/
	//RequestParam 을 생략해서 쓸수도있다.이렇게쓰자("업무명/기능")
	//@RequestMapping 각 핸들러의 공통맵핑url을 지정해서 중복을 제거하자.
	@PostMapping("userOut")
	public String userOut( String username,
			 int age,
			@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
			Model model) {
		model.addAttribute("user",new User(username,age,regDate));
		return "ch02/ex02/userOut";
	}
}
