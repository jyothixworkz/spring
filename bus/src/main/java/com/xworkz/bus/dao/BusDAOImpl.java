package com.xworkz.bus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.bus.dto.BusDTO;

@Repository
public class BusDAOImpl implements BusDAO {
	@Autowired
	private EntityManagerFactory factory;

	public BusDAOImpl() {
		System.out.println("Busdao is created" + this.getClass().getSimpleName());

	}

	@Override
	public boolean collect(BusDTO dto) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

}
