package com.savingstar.application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savingstar.application.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return Arrays.asList(new User("123asdf", "ank@cm.com", "12345"),
				new User("456asdf", "dsfds@cm.com", "qwe345"),
				new User("564asdf", "hgfk@csd.com", "76564")
				);
	}

}
