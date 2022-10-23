package com.xworkz.aeroplane.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping
	String readAll(Model model) {
		List<AeroplaneDTO> list = service.validateAndSave();
		if (list != null && !list.isEmpty()) {
			System.out.println(list.size());
			model.addAttribute("all", list.size());
			model.addAttribute("manoj", list);

		}

		return "Details";

	}

	@GetMapping("/man")
	String ReadByName(HttpServletRequest request, Model model) {
		String string = request.getParameter("name");
		List<AeroplaneDTO> list = service.validateAndReadByName(string);

		if (list != null && !list.isEmpty()) {

			System.out.println(list.size());
			model.addAttribute("all", list.size());
			model.addAttribute("manoj", list);

		}

		return "Details";
	}
}
