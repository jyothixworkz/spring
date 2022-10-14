package com.xworkz.milkshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;
@Service
public class MilkShopServiceImpl  implements MilkShopService{
	@Autowired
	private MilkShopDAO dao;
     public MilkShopServiceImpl() {
    	 System.out.println(" service impl is created "+ this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validateAndSave(MilkShopDTO dto) {
		System.out.println("service  method is created validate and save");
		dao.save(dto);
		return true;
	}
	

}
