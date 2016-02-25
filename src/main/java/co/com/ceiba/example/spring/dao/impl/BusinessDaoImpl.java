package co.com.ceiba.example.spring.dao.impl;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.com.ceiba.example.spring.dao.BusinessDao;
import co.com.ceiba.example.spring.domain.model.Business;
import co.com.ceiba.example.spring.entity.BusinessEntity;

@Named
@Singleton
public class BusinessDaoImpl implements BusinessDao {

	@PersistenceContext
	private EntityManager entityManager;	
	
	public void saveBusiness(Business business) {
		BusinessEntity businessEntity = map(business);
		entityManager.persist(businessEntity);
		
	}

	private BusinessEntity map(Business business) {
		BusinessEntity entity = new BusinessEntity();
		entity.setRif(business.getRif());
		entity.setName(business.getName());
		return entity;
	}

}
