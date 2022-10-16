package com.xworkz.bar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bar.dto.BarDTO;
import com.xworkz.bar.service.BarService;

@Controller
@RequestMapping("/bar")
public class BarController {
	@Autowired
	private BarService service;

	public BarController() {
		// TODO Auto-generated constructor stub

		System.out.println(" nanu barcontroller " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCollect(BarDTO dto) {

		System.out.println(" nanu onCollect method ");
		System.out.println(" maga ninu edune save madthirodu" + dto);
		service.validateAndSave(dto);

		return "Display";

	}

}
