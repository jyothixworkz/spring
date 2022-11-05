package com.xworkz.user.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.user.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private EntityManagerFactory factory;

	public UserDAOImpl() {

		System.out.println(" this daoimpl" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(UserDTO dto) {

		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public Optional<List<UserDTO>> findByMail(String mail) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByMail");
		query.setParameter("ml", mail);
		Optional<List<UserDTO>> list = Optional.of(query.getResultList());
		if (list.isPresent()) {
			return list;
		}
		return Optional.empty();

	}

}
