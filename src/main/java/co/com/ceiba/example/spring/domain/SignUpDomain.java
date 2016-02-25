package co.com.ceiba.example.spring.domain;

import java.util.List;

import co.com.ceiba.example.spring.domain.model.Business;
import co.com.ceiba.example.spring.domain.model.User;

public interface SignUpDomain {

	String signUpUser(User user);

	String signUpBusiness(Business business);
	
	String singUpUserAndBusiness(User user, Business business);

	List<User> getUsers();

}
