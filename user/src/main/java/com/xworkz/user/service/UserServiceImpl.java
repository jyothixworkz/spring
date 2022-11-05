package com.xworkz.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.user.dao.UserDAO;
import com.xworkz.user.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

	public UserServiceImpl() {
		System.out.println(" this is service impl" + this.getClass().getSimpleName());

	}

	@Override
	public boolean validateAndSave(UserDTO dto) {
		dao.save(dto);
		return true;
	}
	@Override
	public Optional<List<UserDTO>> validateAndFindByMail(String mail) {
		
		
		
	
	return dao.findByMail(mail);
	}

}
