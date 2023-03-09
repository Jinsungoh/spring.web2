package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user",new User("최한석",11));
		mv.setViewName("ch02/ex01/user");
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user",new User("한아름",21));
		return "ch02/ex01/user";
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	//User가 모델 31이 view 
	@GetMapping("ch02/ex01/31")
	public void handaler31(User user) {
		user.setUsername("양승일");
		user.setAge(31);
	}
	//어트리뷰트를 지정할수도있다.
	@GetMapping("ch02/ex01/32")
	public void handaler32(@ModelAttribute("man") User user) {
		user.setUsername("서준한");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handaler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handaler42(User user) {
		user.setUsername("박건우");
		user.setAge(41);
		
		return user;
	}
}
/*
위의 코드는 Spring MVC에서 Controller 역할을 하는 클래스인 UserController이다.

@GetMapping 어노테이션은 HTTP GET 요청 메소드에 대한 매핑을 처리하며, 
각각의 매핑 메소드에서는 ModelAndView나 String을 반환하여 사용자에게 전달할 view 이름과 model 객체를 정의한다.

handler11 메소드는 ModelAndView 객체를 인자로 받아 객체에 "최한석"이라는 이름과 11이라는 나이를 가진 User 객체를 추가한 후 view 이름을 "ch02/ex01/user"로 설정하여 반환한다.

handler21 메소드는 Model 객체를 인자로 받아 객체에 "한아름"이라는 이름과 21이라는 나이를 가진 User 객체를 추가하고, view 이름을 "ch02/ex01/user"로 설정하여 반환한다.

handler22 메소드는 인자를 받지 않으며, view 이름만 "ch02/ex01/user"로 설정하여 반환한다.
*/