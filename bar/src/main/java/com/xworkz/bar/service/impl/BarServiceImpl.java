package com.xworkz.bar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dto.BarDTO;
import com.xworkz.bar.service.BarService;
@Service
public class BarServiceImpl implements BarService {
	 @Autowired
	 private BarDAO dao;
	public BarServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(" i am bar service impl "+ this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BarDTO dto) {
		// TODO Auto-generated method stub
		System.out.println(" nanu validate and save method ");
		 dao.collect(dto);
		return false;
	}

}
