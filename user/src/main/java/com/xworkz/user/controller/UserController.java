package com.xworkz.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	public UserController() {

		System.out.println(" this is controller" + this.getClass().getSimpleName());
	}

	@PostMapping
	String Save(UserDTO dto) {
		System.out.println(dto);
		Optional<List<UserDTO>> mail = service.validateAndFindByMail(dto.getMailId());
		if(true) {
		boolean b = service.validateAndSave(dto);
		System.out.println(b);
		}

		return "Success";
	}

}
