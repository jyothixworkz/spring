package com.xworkz.bus.service;

import java.util.List;

import com.xworkz.bus.dto.BusDTO;

public interface BusService {

	boolean validateAndCollect(BusDTO dto);
	List<BusDTO> readAll();
	  List<BusDTO> readAll(String name);
}
