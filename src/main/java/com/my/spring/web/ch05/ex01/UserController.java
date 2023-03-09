package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;
//레스트 컨트롤러 
@RestController("ch05.ex01")
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		return mv;
	}
	
	@GetMapping("get")
	public User get(User user) {
		return user;
	}
	//post 는 추가를의미하고 json 데이타를 받을떄 리퀘스트바디를쓴다.
	@PostMapping("post")
	public User post(@RequestBody User user) {
		return user;
	}
	//통으로 수정할떄 쓰인다. 덮어쓰기
	@PutMapping("put")
	public User put(@RequestBody User user) {
		return user;
	}
	//수정 일부분을 바꿀떄 쓰인다.
	@PatchMapping("patch")
	public User path(@RequestBody User user) {
		return user;
	}
	//삭제
	@DeleteMapping("delete")
	public User delete(@RequestBody User user) {
		return user;
	}
}
