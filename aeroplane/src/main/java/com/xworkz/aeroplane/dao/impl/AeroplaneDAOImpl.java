package com.xworkz.aeroplane.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.dao.AeroplainDAO;
import com.xworkz.aeroplane.dto.AeroplaneDTO;

@Repository
public class AeroplaneDAOImpl implements AeroplainDAO {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public String save(AeroplaneDTO dto) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			manager.close();
		}
		// TODO Auto-generated method stub
		return " nanu kalyan";
	}

}
