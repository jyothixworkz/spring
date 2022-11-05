package com.xworkz.user.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.user.dto.UserDTO;

public interface UserService {
	boolean validateAndSave(UserDTO dto);

	Optional<List<UserDTO>> validateAndFindByMail(String mail);
}
