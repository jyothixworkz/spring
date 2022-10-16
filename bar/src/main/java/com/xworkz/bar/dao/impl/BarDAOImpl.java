package com.xworkz.bar.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dto.BarDTO;

@Repository
public class BarDAOImpl implements BarDAO {
	@Autowired
	private EntityManagerFactory factory;

	public BarDAOImpl() {
		System.out.println(" i am barDAOImpl" + this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean collect(BarDTO dto) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			manager.close();
		}

		// TODO Auto-generated method stub
		return false;
	}

}
