package com.xworkz.pg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.pg.dto.PgDTO;
import com.xworkz.pg.service.PgService;

@Controller
@RequestMapping("/man")
public class PgController {
	@Autowired
	private PgService service;

	public PgController() {
		System.out.println(" nanu controller " + this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}

	@PostMapping
	String onSave(PgDTO dto) {
		System.out.println(" nanu controller method");
		service.vallidateAndSave(dto);

		return "Display";
	}

	@GetMapping
	String onReadAll(Model model) {
		List<PgDTO> all = service.validateAndReadAll();
		if (all != null && !all.isEmpty()) {
			System.out.println(" size" + all.size());
			model.addAttribute("size", "details of pg" + all.size());
			// model.addAttribute("size","total criminals found :"+all.size());
			model.addAttribute("details", all);

			return "Details";

		}
		return "null";
	}
	@GetMapping("/man")
	String onReadByName(Model model, HttpServletRequest request) {
		String parameter = request.getParameter("name");
		
		List<PgDTO> all = service.validateAndReadByName(parameter);
		if (all != null && !all.isEmpty()) {
			System.out.println(" size" + all.size());
			model.addAttribute("size", "details of pg" + all.size());
			// model.addAttribute("size","total criminals found :"+all.size());
			model.addAttribute("details", all);

			return "Details";

		}
		return null;
	}

}
