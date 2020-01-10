package com.infypraks.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infypraks.model.PraksDemoModel;

@Repository
public class PraksDemoDaoImpl implements PraksDemoDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public PraksDemoModel save(PraksDemoModel sales) {
		try {
			sessionFactory.getCurrentSession().persist(sales);
			return sales;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sales;
	}

@Override
	public List<PraksDemoModel> getAlldata(){     
	 Session session = sessionFactory.getCurrentSession();
     CriteriaBuilder cb = session.getCriteriaBuilder();
     CriteriaQuery < PraksDemoModel > cq = cb.createQuery(PraksDemoModel.class);
     Root < PraksDemoModel > root = cq.from(PraksDemoModel.class);
     cq.select(root);
     Query<PraksDemoModel> query = session.createQuery(cq);
     return query.getResultList();
	}
	@Override
	public void deleteById(Integer id) {
		 Session session = sessionFactory.getCurrentSession();
		 //load class is when you are sure it will have id object 
		 PraksDemoModel book = session.byId(PraksDemoModel.class).load(id);
	        session.delete(book);
	
	}
	
	@Override
	public PraksDemoModel updateSales (Integer id) {
		Session session = sessionFactory.getCurrentSession();
		 PraksDemoModel model = session.byId(PraksDemoModel.class).load(id);
		
		 model.setName(model.getName());
		 model.setStatus(model.getStatus());
	        session.update(model);
	        return model;
		
	
	}
	
	
	
	   }
	

