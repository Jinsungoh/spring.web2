package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target";
	}
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	}
	@GetMapping("naver")
	public String naver() {
		return "redirect:https://naver.com";
	}
}
/*
forward() 메서드는 HTTP GET 요청을 처리하고, 
"forward:target"를 반환하여, 다른 컨트롤러나 뷰로 전달되도록 요청을 전달합니다. 
여기서 "target"는 다른 메서드에서 정의된 뷰 이름입니다.

target() 메서드는 HTTP GET 요청을 처리하고, 
"ch02/ex05/target"를 반환하여 해당 뷰를 보여줍니다.

redirect() 메서드는 HTTP GET 요청을 처리하고, 
"redirect:target"를 반환하여, 다른 컨트롤러나 뷰로 리디렉션합니다. 
여기서 "target"는 다른 메서드에서 정의된 뷰 이름입니다.
*/