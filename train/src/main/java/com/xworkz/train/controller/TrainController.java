package com.xworkz.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.train.dto.TrainDTO;
import com.xworkz.train.service.TrainService;

@Controller
@RequestMapping("/train")
public class TrainController {
	@Autowired
	private TrainService service;

	public TrainController() {
		System.out.println("nanu TrainController created ade hen madbeku ega helu");
		// TODO Auto-generated constructor stub
	}

	@PostMapping
	public String onsave(TrainDTO dto) {

		System.out.println("nanu onsave methode");
		System.out.println("nodko edune ninu save madthirodu" + dto);
		boolean b = service.validateAndSave(dto);
		System.out.println("manoj");
		if (b) {
			System.out.println("data is stored");
			return "Display";
		} else {
			System.out.println("agila");
			return "index";
		}

	}

}
