package com.pokemon.controller;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.request.CreateUserRequest;
import com.pokemon.response.UserResponse;
import com.pokemon.service.UserService;



@RestController
@RequestMapping("/pokemon/")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("createUser")
	public UserResponse createUser (@Valid @RequestBody CreateUserRequest createUserRequest) {
		User user = userService.createStudent(createUserRequest);
		return new UserResponse(user);
	}
	

}
