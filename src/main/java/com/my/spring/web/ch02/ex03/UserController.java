package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("ch02/ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	//각 핸들러맵핑 url을 구분할떄 메소드도 구분해야한다.
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}
