package com.xworkz.milkshop.dao.impl;

import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
@Repository
public class MilkShopImpl implements  MilkShopDAO {
	
  public MilkShopImpl() {
	  System.out.println(" dao impl is created");
	// TODO Auto-generated constructor stub
}
	@Override
	public boolean save(MilkShopDAO dao) {
		return true;
	}

}
