package name.beptest.api.service;

import java.util.List;

import name.beptest.api.dto.UserDTO;

public interface UserService {

	List<UserDTO> findAll();
	
	UserDTO save(UserDTO userDto);
}
