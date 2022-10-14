package com.xworkz.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bus.dao.BusDAO;
import com.xworkz.bus.dto.BusDTO;
@Service
public class BusServiceImpl implements BusService {
	@Autowired
	private BusDAO dao;

	public BusServiceImpl() {
		System.out.println("Busserviceimpl is created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndCollect(BusDTO dto) {

		System.out.println("validate and collect method is running");
		dao.collect(dto);
		return false;
	}

}
