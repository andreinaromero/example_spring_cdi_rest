package co.com.ceiba.example.spring.dao;

import java.util.List;

import co.com.ceiba.example.spring.domain.model.User;

public interface UserDao {

	void saveUser(User user);

	List<User> findAllUsers();

}
