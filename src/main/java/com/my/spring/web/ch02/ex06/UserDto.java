package com.my.spring.web.ch02.ex06;

import lombok.Data;

@Data
public class UserDto {
	private String username;
	private String password;
}
//Dto 는 웹레이어에쓴다.서비스레이어로 넘길떄~등등