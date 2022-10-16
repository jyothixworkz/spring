package com.xworkz.train.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dto.TrainDTO;

@Repository
public class TrainDAOImpl implements TrainDAO {
	@Autowired
	 EntityManagerFactory  factory;
	public TrainDAOImpl() {

		System.out.println(" TrainDAO is created " + this.getClass().getSimpleName());

		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(TrainDTO dto) {
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

		return false;
	}

}
