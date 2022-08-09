package name.beptest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import name.beptest.api.dto.UserDTO;

public interface UserDao extends JpaRepository<UserDTO, Integer>{

}
