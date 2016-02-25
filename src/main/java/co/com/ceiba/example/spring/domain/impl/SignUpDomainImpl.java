package co.com.ceiba.example.spring.domain.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.transaction.annotation.Transactional;

import co.com.ceiba.example.spring.dao.BusinessDao;
import co.com.ceiba.example.spring.dao.UserDao;
import co.com.ceiba.example.spring.domain.SignUpDomain;
import co.com.ceiba.example.spring.domain.model.Business;
import co.com.ceiba.example.spring.domain.model.User;

@Named
@Singleton
public class SignUpDomainImpl implements SignUpDomain {
	
	@Inject 
	private UserDao userDao;
	@Inject 
	private BusinessDao businessDao;

	public String signUpUser(User user) {
		userDao.saveUser(user);
		return "usuario creado satisfactoriamente";
	}

	public String signUpBusiness(Business business) {
		businessDao.saveBusiness(business);
		return "empresa creado satisfactoriamente";
	}
	
	@Transactional
	public String singUpUserAndBusiness(User user, Business business) {
		userDao.saveUser(user);
		businessDao.saveBusiness(business);
		return "empresa y usuario creado satisfactoriamente";
	}
	
	public List<User> getUsers() {
		return userDao.findAllUsers();
	}

}
