package com.xworkz.bus.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bus.dto.BusDTO;
import com.xworkz.bus.service.BusService;

@Controller
@RequestMapping("/bus")
public class BusController {
	@Autowired
 private BusService service;
	public BusController() {
		System.out.println("buscontroller is created " + this.getClass().getSimpleName());

	}
	@RequestMapping
	 public String onCollect( BusDTO dto) {
		 System.out.println("oncollect method is running"+dto);
		 service.validateAndCollect(dto);
		 return "Display";
	 }

}
