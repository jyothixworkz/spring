package com.xworkz.aeroplane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplainService;

@Controller
@RequestMapping("/man")
public class AeroplaneController {
	@Autowired
	private AeroplainService service;

	@PostMapping
	String onSave(AeroplaneDTO dto) {
		service.validateAndSave(dto);

		return "Display";
	}

}
