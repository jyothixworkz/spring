package com.xworkz.car.scontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.car.service.CarService;
import com.xworkz.dto.CarDTO;

@Controller
@RequestMapping("/man")
public class CarController {
	@Autowired
	private CarService service;

	public CarController() {
		System.out.println(" nanu controller" + this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}
@PostMapping
	String onSave(CarDTO dto) {
		System.out.println(" edune save madthirodu" + dto);

		service.validateAndSave(dto);
		return "Dispay";
	}
@GetMapping
	String OnReadAll(Model model) {

		List<CarDTO> list = service.validateAndReadAll();
		if (list != null && !list.isEmpty()) {

			System.out.println(list.size());

			model.addAttribute("size", list.size());
			model.addAttribute("details", list);

		}

		return "Details";
	}

}
