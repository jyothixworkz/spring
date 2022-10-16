package com.xworkz.shirt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.shirt.dao.ShirtDAO;
import com.xworkz.shirt.dto.ShirtDTO;
@Repository
public class ShirtDAOImpl  implements ShirtDAO{
	@Autowired
	private EntityManagerFactory factory;
    public ShirtDAOImpl() {
		// TODO Auto-generated constructor stub
    	System.out.println(" nanu shirtdao impl bande "+this.getClass().getSimpleName());
	}
	@Override
	public boolean save(ShirtDTO dto) {
		EntityManager manager = factory.createEntityManager();
		
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getStackTrace();
		}
		finally {
			
			manager.close();
		}
		
		
		return true;
	}

}
