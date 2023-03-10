package com.my.spring.web.ch03.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch03/ex01/res")
public class ResController {
	@GetMapping()
	public void res() {}
}
//자바객체외의것들을 리소스핸들러를 사용한다.