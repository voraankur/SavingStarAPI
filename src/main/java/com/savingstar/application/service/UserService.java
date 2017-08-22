package com.savingstar.application.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.savingstar.application.model.User;

@Service
public class UserService {
	
	private List<User> users = Arrays.asList(new User("123asdf", "ank@cm.com", "12345"),
			new User("456asdf", "dsfds@cm.com", "qwe345"),
			new User("564asdf", "hgfk@csd.com", "76564")
			);
	
	public List<User> getAllUsers() {
		return users;
	}

}
