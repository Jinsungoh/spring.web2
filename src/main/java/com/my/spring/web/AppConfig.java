package com.my.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Value("${attachPath}")
	private String attachPath;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main");
		registry.addViewController("ch02/ex03/user").setViewName("ch02/ex03/user");
	}
	//리소스가 res로 시작하면~ 받는다,그걸 WEB_INF/res 로바꾸고 디폴트서블릿으로 받는다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("res/**").addResourceLocations("WEB-INF/res/");
		registry.addResourceHandler("attach/**").addResourceLocations("file:///" + attachPath + "/");
	}
}
//모델없이 뷰만 쓸떄 뷰컨트롤러를 쓴다.
