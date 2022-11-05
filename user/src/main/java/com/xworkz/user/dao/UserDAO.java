package com.xworkz.user.dao;

import java.util.List;
import java.util.Optional;

import com.xworkz.user.dto.UserDTO;

public interface UserDAO {
	boolean save(UserDTO dto);

Optional<List<UserDTO>> findByMail(String mail);

}
