package name.beptest.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import name.beptest.api.dao.UserDao;
import name.beptest.api.dto.UserDTO;
import name.beptest.api.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<UserDTO> findAll() {
		return userDao.findAll();
	}

	@Override
	public UserDTO save(UserDTO userDto) {
		userDao.save(userDto);
		return userDto;
	}
}
