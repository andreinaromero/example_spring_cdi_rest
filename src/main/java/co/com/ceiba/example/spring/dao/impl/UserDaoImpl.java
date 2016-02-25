package co.com.ceiba.example.spring.dao.impl;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import co.com.ceiba.example.spring.dao.UserDao;
import co.com.ceiba.example.spring.domain.model.User;
import co.com.ceiba.example.spring.entity.UserEntity;

@Named
@Singleton
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;	
	
	public void saveUser(User user) {
		UserEntity userEntity = map(user);
		entityManager.persist(userEntity);
	}

	private UserEntity map(User user) {
		UserEntity entity = new UserEntity();
		entity.setUsername(user.getUserName());
		entity.setName(user.getName());
		return entity;
	}

	public List<User> findAllUsers() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> cq = builder.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();

	}

}
