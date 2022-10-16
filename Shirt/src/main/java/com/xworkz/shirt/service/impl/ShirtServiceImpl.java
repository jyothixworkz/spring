package com.xworkz.shirt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.shirt.dao.ShirtDAO;
import com.xworkz.shirt.dto.ShirtDTO;
import com.xworkz.shirt.service.ShirtService;

@Service
public class ShirtServiceImpl implements ShirtService {
	@Autowired
	private ShirtDAO dao;

	public ShirtServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(" nanu service class " + this.getClass().getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(ShirtDTO dto) {
		// TODO Auto-generated method stub
		dao.save(dto);
		return false;
	}

}
